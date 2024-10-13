fun main() {
    val helicopter = Helicopter()
    helicopter.name = "alligator"
    helicopter.weight = 3_000
    helicopter.speed = 160
    helicopter.maxHeight = 4_000
    helicopter.showInfo()

    val pet = Pet()
    pet.type = Pet.TypePet.COW
    pet.name = "Буренка"
    pet.weight = 300
    pet.showInfo()

    val number = 5.87
    val converter = Converter()
    println(converter.toInt(number))
}

/**
 * 1. Создать класс вертолет со свойствами название(имя), взлетный вес, скорость полета, максимальная высота полета.
 * В классе с методом main создать экземпляр этого класса, например, alligator, свойствам задать конкретные значения.
 * Вывести в консоль строку: «Спроектировали вертолет с названием… скоростью полета… весом… высотой полета…»
 */
class Helicopter {
    var name: String = ""
    var weight: Int = 0
    var speed: Int = 0
    var maxHeight: Int = 0

    fun showInfo() {
        println("Спроектировали вертолет с названием $name скоростью полета $speed весом $weight высотой полета $maxHeight.")
    }
}

/**
 * 2. Написать класс домашнее животное.
 * Свойствами класса будут вес, кличка и принадлежность к определённому типу
 * (коровы, гуси, собаки и так далее), нужно их написать в классе.
 * В классе с главным методом создайте свое домашнее животное. Выведите в консоль:
 * println("Домашнее животное: " + … +
 *        "Кличка: " + …. +
 *        "Вес: " + …);
 */
class Pet {
    var weight = 0
    var name = ""
    var type: TypePet = TypePet.CAT

    enum class TypePet {
        COW, DUCK, DOG, CAT,
    }

    fun showInfo() {
        println("Домашнее животное: $type, Кличка: $name, Вес: $weight.")
    }
}

/**
 * 3. Даны переменная с плавающей точкой, равная 5,87. Необходимо привести ее к целочисленному типу.
 */
class Converter {
    fun toInt(double: Double): Long = Math.round(double)
}