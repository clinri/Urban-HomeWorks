import java.util.*

fun main() {
    task1()
    task2()
}

/**
 * 1. Написать программу, которая будет включать несколько классов и enum.
 * Ход работы следующий.
 * При запуске среда просит ввести месяц года.
 * После ввода месяца и нажатия на enter, на консоль выводится время года, которому соответствует этот месяц.
 * После этого программа вновь спросит: "Желаете продолжить или закончить программу?"
 * 1. Продолжить;
 * 2. Закончить программу.
 * Если нажимаем продолжить, то программа вновь просит ввести месяц и цикл повторяется.
 */
fun task1() {
    while (true) {
        println("Введите месяц года")
        val month = readln().toInt()
        val season = when (month) {
            12 -> Season.WINTER
            in 1..2 -> Season.WINTER
            in 3..5 -> Season.SPRING
            in 6..8 -> Season.SUMMER
            in 9..11 -> Season.AUTUMN
            else -> throw Exception("Введен несуществующий месяц")
        }
        println(season.text)
        println("1. Продолжить\n2. Закончить программу")
        when (readln().toInt()) {
            1 -> continue
            2 -> break
        }
    }
}

/**
 * 2. Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.
 */
fun task2() {
    val text = "Шумоизоляция".lowercase(Locale.getDefault())
    print("В слове $text ")
    val chars = text.toCharArray()
    val count = chars.size - chars.toSet().size
    println("$count повторяющихся символов")
}