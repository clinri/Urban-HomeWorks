import kotlin.math.pow

fun main() {
    println(task1(15))
    println(task2("1111"))
    println(task3(123454321))
}

/**
 * 1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.
 */
fun task1(dec: Int): String {
    var result = ""
    var resultDivision = dec
    do {
        result = (resultDivision % 2).toString() + result
        resultDivision /= 2
    } while (resultDivision > 1)
    result = resultDivision.toString() + result
    return result
}

/**
 * 2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.
 */
fun task2(bin: String): Int {
    var result = 0
    for (i in bin.indices) {
        result += bin[i].digitToInt() * 2.0.pow((bin.length - 1 - i).toDouble()).toInt()
    }
    return result
}

/**
 * 3. Написать программу, которая проверяет, является ли слово палиндромом.
 */
fun task3(number: Int): Boolean {
    val string = number.toString()
    for (i in 0..string.length / 2) {
        if (string[i] != string[string.length - 1 - i]) return false
    }
    return true
}
