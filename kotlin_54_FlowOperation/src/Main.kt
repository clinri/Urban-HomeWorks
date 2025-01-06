import kotlinx.coroutines.flow.*

suspend fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Дан список целых чисел, который передан в поток. Найти сумму всех его элементов, возведенных в квадрат.
 * Целесообразно использовать функции map(), reduce().
 */
suspend fun task1() {
    val numberFlow = listOf(1, 4, 7, 5).asFlow()
    val result = numberFlow
        .map { it * it }
        .reduce { sum, n -> sum + n }
    println(result)
}

/**
 * 2. Дан список объектов класса Person, состоящий из 10 человек. Каждый участник списка имеет о себе информацию:
 * имя и возраст. Необходимо написать функцию – расширения getPerson(first: String, age: Int),
 * которая расширяет Flow <Person>. Данная функция принимает поток данных и выводит в консоль информацию о Person,
 * соответствующую условиям, переданным в ее параметры.
 * В функции main с клавиатуры ввести критерии поиска по первому символу имени и возрасту.
 * Вызвать функцию getPerson() у объекта, который был передан в поток в виде списка Person, состоящего из 10 человек.
 */
suspend fun task2() {
    val personList = listOf(
        Person("Васий", 55),
        Person("Петр", 34),
        Person("Анна", 37),
        Person("Вера", 23),
        Person("Никита", 62),
        Person("Кристина", 47),
        Person("Андрей", 37),
        Person("Борис", 35),
        Person("Кирилл", 67),
        Person("Евгений", 16),
    )
    println("Введите первый символ имени для поиска")
    val first = readln().uppercase()
    println("Введите возраст для поиска")
    val age = readln().toInt()
    personList.asFlow().getPerson(first, age)
}

suspend fun Flow<Person>.getPerson(first: String, age: Int) {
    this.filter { it.name.first().toString() == first && it.age == age }
        .collect(::println)
}

/**
 * 3. *** Программа формирования информации о сотрудниках компании.
 * В отдел кадров поступил список принятых на работу сотрудников.
 * Существует список банковских карт и паролей к ним по количеству принятых сотрудников.
 * Все три списка данных будут переданы потоками в отдел кадров для формирования списка полной информации.
 * Результат: получить список такого вида:
 * [Person(name=Петр, cart=2981 4664 2788 5634 , password=7828 ), Person(name=Николай, cart=7728 4346 5068 1464 , password=8333 ), Person(name=Василий, cart=9456 7443 9129 6753 , password=3092 )]
 * В программе существует класс Person с полями имени, карты и пароля.
 * Должна быть написана функция получения сгенерированного номера карты и пароля.
 * Полученные номера карт и пароли передаются в списки карт и паролей соответственно.
 * Данные всех трех списков предаются потоками.
 * Написать функцию объединения трех потоков, которая принимает на вход три потока
 * first: Flow<T1>, second: Flow<T2>, third: Flow<T3>,
 * функцию типа suspend (T1, T2, T3) -> R и возвращает Flow<R>,
 * в функции происходит объединение first.zip(second) и затем .zip(third),
 * в результате чего мы будем получать Person(name, card, password).
 * В функции main создать список persons, в который будут добавляться объекты Person,
 * которые получаются при работе функции объединения трех потоков данных списков
 * и получения их с помощью функции collect. Вывести в консоль полученный полный список данных.
 */
suspend fun task3() {
    val flowNames = flowOf("Виталий", "Иван", "Дмитрий", "Наталья", "Владимир")
    val flowCardNumbers = List(5) { generateCardNumber() }.asFlow()
    val flowPasswords = List(5) { generatePassword() }.asFlow()
    val result = mutableListOf<task3.Person>()
    transformThreeFlow(flowNames, flowCardNumbers, flowPasswords) { name, cardNumber, password ->
        task3.Person(name, cardNumber, password)
    }.collect { result.add(it) }
    println(result)
}

fun generateCardNumber(): String {
    var cardNumber = ""
    repeat(16) { index ->
        cardNumber += ((0..9).random())
        if ((index + 1) % 4 == 0 && index != 15) cardNumber += (" ")
    }
    return cardNumber
}

fun generatePassword(): String {
    var password = ""
    repeat(4) { index ->
        password += ((0..9).random())
    }
    return password
}

fun <T1, T2, T3, R> transformThreeFlow(
    first: Flow<T1>,
    second: Flow<T2>,
    third: Flow<T3>,
    transform: suspend (T1, T2, T3) -> R,
): Flow<R> = first.zip(second) { first1, second1 ->
    Pair(first1, second1)
}.zip(third) { pair, third1 ->
    transform(pair.first, pair.second, third1)
}
