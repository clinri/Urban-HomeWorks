fun main() {
    task1("{([])}")
    task1("{([))}")
    task1("{{[])}")
    task2()
}

/**
 * 1. Дана строка из скобок "{([])}".
 * Проверить наличие у каждой открывающейся скобки на своей позиции – закрывающейся на своей,
 * соблюдая принцип «симметричности». Т.е. в данном случае при проверке программы должно выйти true,
 * т.к. соответствие прослеживается. Если допустим, строка будет такого плана "{([))}","{{[])}" – это false.
 */
fun task1(stringBracket: String) {
    print("$stringBracket - ")
    val bracketVariants = listOf(
        Pair('{', '}'),
        Pair('[', ']'),
        Pair('(', ')')
    )
    var result = true
    for (i in 0 until stringBracket.length / 2) {
        val pair = Pair(stringBracket[i], stringBracket[stringBracket.length - 1 - i])
        val isPair = bracketVariants.contains(pair)
        if (!isPair) {
            result = false
            break
        }
    }
    println(result)
}

/**
 * 2. Дан массив целых чисел val array = intArrayOf(1, 2, 3).
 * Вывести в консоль максимальное количество перестановок элементов массива. Т.е. результат будет следующим:
 * [1, 2, 3]
 * [1, 3, 2]
 * [2, 1, 3]
 * [2, 3, 1]
 * [3, 2, 1]
 * [3, 1, 2]
 */
fun task2() {
    val array = intArrayOf(1, 2, 3)
    val listArray = List(100) {
        val newArray = array.clone()
        newArray.shuffle()
        newArray.toList()
    }.toSet()
    listArray.forEach {
        println(it)
    }
}