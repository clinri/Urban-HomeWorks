import kotlin.math.pow

fun main() {
    println(3.squared())
    println("Привет".concat("мир!"))
    println("Мир".lastIndex())
    println(16.squareRoot())
}

/**
 * 1. Написать функцию расширения возведения в квадрат целого числа.
 */
fun Int.squared() = this * this

/**
 * 2. Написать функцию расширения конкатенации строк.
 */
fun String.concat(nextString: String) = "$this $nextString"

/**
 * 3. Написать функцию расширения определения последнего индекса в строке.
 */
fun String.lastIndex() = this.lastIndex

/**
 * 4. Написать функцию получения квадратного корня из целого числа.
 */
fun Int.squareRoot() = this.toDouble().pow(0.5)