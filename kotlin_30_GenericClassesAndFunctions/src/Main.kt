fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Написать функцию print(), которая на вход может принимать различные типы.
 * Вызвать эту функцию несколько раз, поместив аргументы разных типов.
 */
fun task1() {
    print("Текст")
    print(123)
    print(object {
        val name = "Вася"
        val age = 22

        override fun toString() = "Имя: $name, возраст: $age"
    })
}

fun <T> print(arg: T) = println(arg)


/**
 * 2. Создать параметризованный класс Person,
 * у которого свойство номера телефона в конструкторе может передаваться по – разному,
 * как в виде числа, так и в виде строки.
 * Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой.
 * Вывести полученную информацию о них. Person: name = имя, phone = телефон
 */
fun task2() {
    val person1 = Person("Петр", 89007006040)
    val person2 = Person("Петр", "89005004565")
    println(person1)
    println(person2)
}

class Person<T>(
    private val name: String,
    private val phone: T,
) {
    override fun toString() = "Person: name = $name, phone = $phone"
}

/**
 * 3. Написать функцию вывода в консоль переменных разных типов данных.
 * Вторым параметром в функции будет тип Char и будет представлять то,
 * во что будет оборачиваться переменная параметризованного типа, поступающая на вход в качестве первого параметра.
 * Например, переменная Int должна оборачиваться в фигурные скобки.
 * Пример ввода данных и полученного результата должен быть таким:
 * val a: Int = 10 -> {10}
 * val b: String = "Hello" -> [Hello]
 * val c: List<Int> = listOf(10, 16, 3) -> "[10, 16, 3]"
 * val d = 'f' -> (f)
 */
fun task3() {
    val a: Int = 10
    val b: String = "Hello"
    val c: List<Int> = listOf(10, 16, 3)
    val d = 'f'
    universalPrint(a, '{', '}')
    universalPrint(b, '[', ']')
    universalPrint(c, '"', '"')
    universalPrint(d, '(', ')')
}

fun <T> universalPrint(arg: T, symbolStart: Char, symbolEnd: Char) {
    println("$symbolStart$arg$symbolEnd")
}