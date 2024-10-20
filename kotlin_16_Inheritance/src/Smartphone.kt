open class Smartphone {

    var model = "Noname"
    var sizeScreen: Double = 4.0
    var operativeMemory = 2048
    var constantMemory = 128000

    fun calling(number: String) {
        println("смартфон $model совершает звонок на номер $number")
    }
}

class Nokia : Smartphone()
class Sony : Smartphone()