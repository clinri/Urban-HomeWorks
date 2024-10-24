import java.util.*

fun main() {
    task1(6)
    task2(4, 5)
    task3(4, 7)
    task4(2)
    task5()
}

/**
 *  1. Дано целое число n (>0). Найти сумму 1+1/2+1/3+…+1/n (вещественное число).
 */
fun task1(number: Int) {
    var sum = 0.0
    for (i in 0..number) {
        sum += 1.0 / (1 + i)
    }
    println(sum)
}

/**
 * 2. Даны два целых числа a и b (a<b). Найти сумму квадратов всех целых чисел от a до b включительно.
 */
fun task2(a: Int, b: Int) {
    if (a < b) {
        var number = a
        var sum = 0
        do {
            sum += (number * number)
        } while (number++ < b)
        println(sum)
    } else throw Exception("a должно быть меньше b")
}

/**
 * 3. Даны целые числа A и B (A<B). Вывести все целые числа от A до B включительно; при этом
 * число A должно выводиться 1 раз,
 * число A+1 должно выводиться 2 раза и т.д.
 * (допустим a = 3, b = 5; вывод: 3,4,4,5,5,5)
 */
fun task3(a: Int, b: Int) {
    if (a < b) {
        var number = a
        val diff = b - a
        for (i in 1..diff + 1) {
            repeat(i) { print("$number") }
            number++
        }
        println()
    } else throw Exception("a должно быть меньше b")
}

/**
 * 4. Дано число n. Написать программу, которая проверяет, является ли оно простым.
 */
fun task4(n: Int) {
    var isSimpleNumber = true
    for (i in 1..n) {
        if (n % i != 0) {
            isSimpleNumber = false
            break
        }
    }
    println("$n ${if (isSimpleNumber) "является" else "не является"} простым числом")
}

/**
 * 5. Есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?"
 * Ответ: троллейбус. Представим, что Вы загадываете эту загадку пользователю.
 * Создайте программу, которая будет считывать с консоли ответ.
 *
 * Условия задачи:
 * У пользователя есть 3 попытки. После трех ответов программа должна завершиться;
 * Если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
 * Если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
 * Если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
 */
fun task5() {
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    for (i in 1..3) {
        val input = readln()
        when (input.lowercase(Locale.getDefault())) {
            "троллейбус" -> {
                println("Правильно!")
                break
            }

            "сдаюсь" -> {
                println("Правильный ответ: троллейбус.")
                break
            }

            else -> println("Подумай еще.")
        }
    }
}