/**
 * 1. Написать функцию высшего порядка action, которая на вход принимает значения двух цветов типа String.
 * Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action,
 * она же возвращает строку – получившейся цвет.
 * Функция action возвращает результат в виде строки смешанный цвет из двух заданных.
 */
fun action(color1: String, color2: String, mixer: (String, String) -> String): String {
    return mixer(color1, color2)
}

/**
 * 2. Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два.
 * Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым параметром функцию,
 * принимающую число и возвращающая число. Функция высшего порядка будет возвращать измененный массив,
 * который будет получаться за счет вызова внутри нее у этого массива функции map,
 * внутри которой будет вызываться функция изменения числа.
 */
fun increase(number: Int) = number + 1

fun multiTwo(number: Int) = number * 2

fun higherOrderFunctions(numbers: IntArray, changer: (Int) -> Int): IntArray {
    return numbers.map { changer(it) }.toIntArray()
}