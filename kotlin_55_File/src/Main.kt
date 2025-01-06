import java.io.File

fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Создать функции, которые выполняют запись в файл и чтение из файла.
 * Записать туда любой текстовый файл и выполнить его чтение.
 */
fun task1() {
    val file = File("kotlin_55_File/file_task1")

    fun readFromFile(): String {
        return if (file.exists()) file.readText()
        else ""
    }

    fun writeToFile(text: String) {
        file.writeText(text)
    }
    writeToFile("Привет мир!\nФайл записан!\n")
    println(readFromFile())
}

/**
 * 2. Даны путь к файлу и имя файла и целое число N (>1) .
 * Создать файл целых чисел с данным именем и записать в него N первых положительных четных чисел (2,4,…N).
 */
fun task2() {
    val filePath = "kotlin_55_File"
    val fileName = "file_task2"
    val number = 43
    val file = File("$filePath/$fileName")
    if (number > 2) {
        var result = ""
        for (i in 2..number step 2) {
            result += "$i\n"
        }
        file.writeText(result)
    }
}

/**
 * 3. Дан файл целых чисел, содержащий не менее четырех элементов.
 * Вывести первый, второй, предпоследний и последний элементы данного файла.
 */
fun task3() {
    val file = File("kotlin_55_File/file_task3")
    val text = file.readText()
    val result = text.removeRange(2 until text.length - 2)
    println(result)
}