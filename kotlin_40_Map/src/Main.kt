fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. *** Напишите функцию, которая получает на вход массив элементов типа К (Generic) и возвращает Map<K, Int>,
 * где K — значение из массива, а Int — количество вхождений в массив.
 * Т.е. массив val array = arrayOf(2, 4, 7, 1, 2, 4). Выходные данные: {1=1, 2=2, 4=2, 7=1}.
 */
fun task1() {
    val numberArray = arrayOf(2, 4, 7, 1, 2, 4)
    println(numberArray.contentToString())
    println(createMapFromArray(numberArray))
}

fun <K> createMapFromArray(array: Array<K>): Map<K, Int> {
    val result = mutableMapOf<K, Int>()
    for (item in array.toSet()) {
        result[item] = array.count { it == item }
    }
    return result
}

/**
 * 2. Дан map val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна").
 * Написать функцию, удаляющую элементы по введенному с клавиатуры значению.
 * Т.е., если набрали «Петр» коллекция должна стать такого вида {1=Иван, 3=Лида, 5=Анна}
 */
fun task2() {
    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")
    println(people)
    println("Элемент с каким значением удалить?")
    val valueForRemove = readln()
    var keyForRemove: Int? = null
    people.forEach { if (it.value == valueForRemove) keyForRemove = it.key }
    keyForRemove?.let(people::remove)
    println(people)
}

/**
 * 3. Создать data класс Person, в конструктор он принимает свойства имени, возраста и должности.
 * В главной функции создать personHashMap и заполнить его несколькими элементами,
 * где ключом будет целое число – порядковый номер, значением – объект Person. Вывести полученную коллекцию в консоль.
 */
fun task3() {
    val personHashMap = hashMapOf(
        1 to Person("Вася", 30, "Директор"),
        2 to Person("Андрей", 34, "Бухгалтер"),
        3 to Person("Петр", 24, "Сторож"),
        4 to Person("Анастасия", 19, "Программист"),
        5 to Person("Ирина", 29, "Повар"),
    )
    personHashMap.forEach { println(it) }
}

data class Person(
    val name: String,
    val age: Int,
    val position: String,
)