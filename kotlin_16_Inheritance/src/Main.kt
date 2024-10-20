fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Создать суперкласс Animal(животное) со свойствами веса и имени.
 * Написать функцию, которая описывает прием пищи животного.
 * Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса.
 * У каждого животного определить по одной своей функции.
 */
fun task1() {
    val cat = Cat()
    cat.name = "Машка"
    cat.weigth = 4000
    cat.eating()
    cat.voice()
    println("======")
    val dog = Dog()
    dog.name = "Барбос"
    dog.weigth = 7000
    dog.eating()
    dog.search()
}

/**
 * 2. Создать классы Nokia и Sony. Наследовать каждый из них от суперкласса Smartphone.
 * Создать несколько свойств в суперклассах и функцию звонка.
 */
fun task2() {
    val nokia = Nokia()
    nokia.model = "Nokia"
    nokia.sizeScreen = 8.0
    nokia.operativeMemory = 8192
    nokia.constantMemory = 131072
    nokia.calling("89058005670")
    val sony = Sony()
    sony.model = "Sony"
    sony.sizeScreen = 7.8
    sony.operativeMemory = 6144
    sony.constantMemory = 65536
    sony.calling("89046897843")
}

/**
 * 3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран элементы массива, которые делятся на 5 на цело.
 */
fun task3() {
    val numbers = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    for (number in numbers) {
        if (number % 5 == 0) {
            println(number)
        }
    }
}