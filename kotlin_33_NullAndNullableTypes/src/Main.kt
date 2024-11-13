fun main() {
    task1("Колобок")
    task2()
    task3()
}

/**
 * 1. Написать функцию, которая выводит в консоль Вашу любимую книгу.
 * Входной параметр – название книги. Если в аргументы передается значение null,
 * вывести фразу «У меня нет любимой книги».
 */
fun task1(favoriteBookName: String?) {
    println(favoriteBookName ?: "У меня нет любимой книги")
}

/**
 * 2. Создайте функцию, которая возвращает сколько раз целое число может быть разделено на другое целое число без остатка.
 * Функция должна возвращать null, если результатом деления является не целое число. Назовите функцию DivideIfWhole.
 * Дополнительно написать решение, в случае, когда нет ни одного деления без остатка – вывести ноль.
 * Рефакторинг сделать с применением оператора ?:
 */
fun task2() {
    println(divideIfWhole(8, 9) ?: 0)
}

fun divideIfWhole(firstNumber: Int, secondNumber: Int): Int? {
    var result = 0
    var tempResultAfterDivide = firstNumber
    while (tempResultAfterDivide % secondNumber == 0) {
        tempResultAfterDivide /= secondNumber
        result++
    }
    return if (result == 0) null else result
}

/**
 * 3. Дан массив строк array = arrayOf("Привет","как", null, "дела"). Создать новый массив,
 * который будет состоять из элементов массива array, которые не являются null. Вывести их в консоль.
 */
fun task3() {
    val array = arrayOf("Привет", "как", null, "дела")
    val newArray = array.filter { it != null }
    println(newArray)
}