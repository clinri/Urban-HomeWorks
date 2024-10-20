open class Animal {

    var weigth = 0
    var name = ""

    fun eating() {
        println("Животное $name с весом $weigth принимает пищу")
    }
}

class Cat : Animal() {

    fun voice() {
        println("Кошка говорит мяу")
    }
}

class Dog : Animal() {

    fun search() {
        println("Собака ищет след")
    }
}

