import kotlin.math.min

fun main() {
    println(numberInDegree(3, -2))
    println(task2(3, 5))
    println(task3(16, 24))
}

/**
 * 1. Написать функцию возведения числа a в степень n.
 */
fun numberInDegree(number: Int, degree: Int): Double {
    return Math.pow(number.toDouble(), degree.toDouble())
}

/**
 * 2. Написать функцию, которая принимает два целых числа a и b (a<b). Она вычисляет произведение всех целых чисел от a до b включительно.
 */
fun task2(a: Int, b: Int): Int {
    if (a < b) {
        var result = a
        for (i in a + 1..b) {
            result *= i
        }
        return result
    } else {
        throw Exception("a <= b")
    }
}

/**
 * 3. Написать функцию, которая принимает два целых числа a и b. Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
 */
fun task3(a: Int, b: Int): Int {
    var result = 1
    for (i in 2..min(a, b)) {
        if (a % i == 0 && b % i == 0) {
            result = i
        }
    }
    return result
}