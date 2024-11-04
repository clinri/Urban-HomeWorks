class Human(val name: String) {

    inner class Head {

        fun think() {
            println("Человек с именем $name думает")
        }

        fun rotate() {
            println("Человек с именем $name поворачивает голову")
        }
    }

    inner class Legs {

        fun straighten() {
            println("Человек с именем $name выпрямляет ноги")
        }

        fun go() {
            println("Человек с именем $name делает шаги ногами")
        }
    }
}