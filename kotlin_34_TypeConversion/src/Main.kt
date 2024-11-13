fun main() {
    task1()
    task2()
    task3()
}

/**
 *
 * 1. Дана строка, содержащая в себе значение 12.3. Преобразовать ее в целое число, число с плавающей точкой,
 * число в двоичной системе представления и вывести в консоль.
 * Для части преобразований, например, в двоичное представление, необходимо сделать несколько преобразований,
 * чтобы целое число перевести в двоичное.
 */
fun task1() {
    val string = "12.3"
    val double = string.toDouble()
    val integer = double.toInt()
    println(integer)
    println(double)
    val binary = Integer.toBinaryString(integer)
    println(binary)
}

/**
 * 2. Написать функцию, которая проверяет чем, является вводимый аргумент строкой, числом, числом с плавающей точкой,
 * символом. Вывод должен быть таким: «Это строка».
 */
fun task2() {
    println("Введите набор символов для определения типа данных")
    val input = readln()
    checkType(input)
}

fun checkType(argument: Any) {
    val string = argument.toString()
    val result: Any = try {
        string.toInt()
    } catch (e: Exception) {
        try {
            string.toDouble()
        } catch (e: Exception) {
            string
        }
    }
    println(
        when (result) {
            is Int -> "Это целое число"
            is Double -> "Это число с плавающей точкой"
            else -> "Это строка"
        }
    )
}

/**
 * 3. Написать функцию, которая на вход принимает типизированный параметр.
 * Если это будет целое число, то в консоль вывести сумму вводимого числа и единицы,
 * если строка - сумму длины строки и единицы, если массив целых чисел - сумму элементов массива.
 */
fun task3() {
    actionWithTypedArgument(7)
    actionWithTypedArgument("any")
    actionWithTypedArgument(arrayOf(4, 6))
}

fun <T> actionWithTypedArgument(argument: T) {
    val result: Int? = when (argument) {
        is Int -> argument + 1

        is Array<*> -> {
            argument.reduce { acc, any ->
                if (acc is Int && any is Int) acc + any
                else 0
            } as Int
        }

        is String -> argument.length + 1

        else -> null
    }
    println(result)
}