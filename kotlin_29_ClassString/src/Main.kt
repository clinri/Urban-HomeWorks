fun main() {
    task1()
    println(task2("+79004004565"))
    task3()
    task4()
}

/**
 * 1. Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.
 */
fun task1() {
    val stroke = "Занятие"
    stroke.forEach { println(it) }
}

/**
 * 2. Нужно осуществить проверку номера телефона.
 * Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
 * Если телефон верно введен, выведите true, иначе false.
 */
fun task2(tel: String): Boolean {
    return tel.substring(0..1) == "+7" && tel.takeLast(10).all { it.isDigit() }
}

/**
 * 3. Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
 */
fun task3() {
    val stroke = "Вечность"
    stroke.reversed().forEach { println(it) }
}

/**
 * 4. Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.
 */
fun task4() {
    val stroke = "kotlin2023course"
    println(stroke.filter { it.isDigit() }.length)
}