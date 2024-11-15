fun main() {
    task1()
    task2()
    task3()
    task4()
}

/**
 * 1. Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте ее по значению ключа, допустим, менее значения равного 5.
 */
fun task1() {
    val nameMap = mapOf(1 to "Коля", 2 to "Вася", 3 to "Федя", 4 to "Маша", 5 to "Катя", 6 to "Сергей")
    val filteredMap = nameMap.filter { it.key < 5 }
    println(filteredMap)
}

/**
 * 2. Дан map, в которой элементы содержат ключ целое число, значения имена. Отфильтруйте по значениям,
 * оканчивающимся на букву «а».
 */
fun task2() {
    val nameMap = mapOf(1 to "Коля", 2 to "Вася", 3 to "Федя", 4 to "Маша", 5 to "Катя", 6 to "Сергей")
    val filteredMap = nameMap.filter { it.value.endsWith("а") }
    println(filteredMap)
}

/**
 * 3. Дан map, в которой элементы содержат ключ целое число, значения имена. Отфильтруйте по значениям,
 * Начинающимся на букву «Г».
 */
fun task3() {
    val nameMap = mapOf(1 to "Коля", 2 to "Гриша", 3 to "Федя", 4 to "Маша", 5 to "Гена", 6 to "Сергей")
    val filteredMap = nameMap.filter { it.value.startsWith("Г") }
    println(filteredMap)
}

/**
 * 4. Дан map prizeMap, описывающий ключом порядковый номер сотрудника, значение характеризует процент премии сотруднику.
 * Отфильтровать исходный map с таким расчетом, чтобы получить данные сотрудников,
 * чей порядковый номер оканчивается на «5» и процент премии больше 20.
 */
fun task4() {
    val prizeMap = mapOf("1" to 10, "2" to 15, "5" to 5, "6" to 55, "15" to 30, "6" to 32)
    val filteredMap = prizeMap.filter { it.key.endsWith("5") && it.value > 20 }
    println(filteredMap)
}