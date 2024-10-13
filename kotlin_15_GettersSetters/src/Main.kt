fun main() {
    val card = BankCard()
    card.numberCard = "1234567812345678"
    card.codeCard = 334
    println(card.codeCard)
    println(task2(4))
    println(task3(45))
}

/**
 * 2. Дана переменная a – целое число. Используя составные операторы присваивания необходимо выполнить операции:
 * a увеличить на 7,
 * полученное число уменьшить на 4,
 * далее полученный результат умножить на 2
 * и найти остаток от деления разделив на 3.
 */
fun task2(a: Int): Int {
    var number = a
    number += 7
    number -= 4
    number *= 2
    return number % 3
}

/**
 * 3. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 753 -> 357.
 */
fun task3(number: Int): Int {
    return if (number in 10..99) {
        val first = number / 10
        val second = number % 10
        second * 10 + first
    } else {
        println("введено не двузначное число")
        0
    }
}