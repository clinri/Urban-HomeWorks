fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Создать класс Bird(птица).
 * Определить у него несколько свойств, например, тип (пеликанообразные, фламингообразные и т.д.).
 * Создать в классе свойство, которое будет характеризовать по какому-то явному признаку,
 * например, есть птицы, которые не могут подниматься в воздух или по другому признаку.
 * Определить функциональность класса птица.
 * Создать несколько классов наследников, которые могут переопределять свойства и функции класса – родителя.
 */
fun task1() {
    val parrot = Parrot("Попугаеобразные")
    parrot.birdInfo()
    parrot.move()
    val duck = Duck("Уткообразные")
    duck.birdInfo()
    duck.move()
    val ostrich = Ostrich("Страусообразные")
    ostrich.birdInfo()
    ostrich.move()
}

/**
 * 2. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 */
fun task2() {
    val arrayString = arrayOf("облако", "ящерица", "водоплавающее", "уж")
    var maxLengthIndex = 0
    for ((index, value) in arrayString.withIndex()) {
        if (value.length > arrayString[maxLengthIndex].length) {
            maxLengthIndex = index
        }
    }
    println("Самое длинное слово \"${arrayString[maxLengthIndex]}\" содержит ${arrayString[maxLengthIndex].length} букв")
}

/**
 * 3. Дана строка «ПриВет, кАк деЛа».
 * Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество.
 */
fun task3() {
    val str = "ПриВет, кАк деЛа"
    var result = ""
    for (s in str.toCharArray()) {
        if (s.isUpperCase()) result += s
    }
    println("В верхнем регистре ${result.length} символов: $result")
}