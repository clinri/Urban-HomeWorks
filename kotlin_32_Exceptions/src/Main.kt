fun main() {
    task1()
}

/**
 * Создать каталог пользователей вместимостью не более 10 персон.
 * Она будет содержать функцию приветствия greeting().
 *
 * Необходимо написать функцию createList(list: Array<String>), в которой нужно вводить имя и фамилию,
 * предлагать пользователю разместить созданного члена каталога на ту или иную позицию в каталоге list.
 * Помещать его туда.
 *
 * Программа должна перехватывать исключения на ввод пустого имени и определения места в каталоге,
 * которого не существует. Как пожелание, предлагаю написать свой класс исключений, например, с названием MyException.
 */
fun task1() {
    var persons = arrayOf(
        "Федор Двинятин",
        "Василий Пупкин",
        "Леша Попович",
        "Робинзон Крузо",
    )
    try {
        persons = createList(persons)
    } catch (e: Exception) {
        println(e.message)
    }
    println("Создан каталог:")
    printCatalog(persons)
}

fun createList(list: Array<String>): Array<String> {
    println("Введите имя и фамилию персоны")
    val person = readln()
    if (person.isEmpty()) throw MyException("Введено пустое значение")
    println("Введите номер позиции в каталоге:")
    printCatalog(list)
    println("в которой хотели бы разместить новое значение")
    val newIndex = try {
        readln().toInt() - 1
    } catch (e: Exception) {
        println("Введено не число"); 0
    }
    return try {
        val result = list.toMutableList()
        result.add(newIndex, person)
        result.toTypedArray()
    } catch (e: IndexOutOfBoundsException) {
        println("Введен недопустимый индекс"); list
    }
}

private fun printCatalog(list: Array<String>) {
    for ((index, item) in list.withIndex()) {
        println("${index + 1}. $item")
    }
}

class MyException(
    message: String,
) : Exception(message)