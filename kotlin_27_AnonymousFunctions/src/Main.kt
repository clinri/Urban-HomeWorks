fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Написать анонимную функцию – поздравление с наступающим новым годом.
 * Ее тип следующий (String, Int) -> String.
 * Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют.
 * Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
 */
fun task1() {
    val greetingWithNewYear = fun(name: String, year: Int): String {
        return "$name, поздравляем тебя c наступающим $year годом!"
    }
    println(greetingWithNewYear("Василий", 2025))
}

/**
 * 2. Создать массив целых чисел произвольного размера.
 * Написать анонимную функцию isEven, проверяющую число на четность, она возвращает логический тип.
 * Написать функцию checkArrayElement проверки массива и его элементов на четность,
 * она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
 */
fun task2() {
    val numberArray = arrayOf(2, 6, 9, 5, 3, 7, 4, 45, 345, 4, 453, 45, 345, 787, 3, 23342, 878, 79)
    val isEven = fun(number: Int): Boolean {
        return number % 2 == 0
    }
    println(checkArrayElement(numberArray, isEven))
}

fun checkArrayElement(array: Array<Int>, isEven: (Int) -> Boolean): Boolean {
    return array.all(isEven)
}

/**
 * 3. Напишите анонимную функцию для объединения двух строк и возврата результата.
 */
fun task3() {
    val string1 = "Привет"
    val string2 = "мир"
    val unite = fun(string1: String, string2: String): String {
        return "$string1 $string2"
    }
    println(unite(string1, string2))
}