import kotlin.random.Random

open class Bird(
    var type: String,
    open var flyable: Boolean = true,
    open var swimmable: Boolean = true,
) {
    fun birdInfo() {
        println("Птица относящаяся к типу $type, ${able(flyable)} летать, ${able(swimmable)} плавать")
    }

    open fun move() {
        when {
            (flyable and swimmable) -> if (Random.nextBoolean()) fly() else swim()
            (flyable and !swimmable) -> fly()
            (!flyable and swimmable) -> swim()
        }
    }

    private fun fly() {
        println("Птица полетела")
    }

    private fun swim() {
        println("Птица поплыла")
    }

    private fun able(able: Boolean) = if (able) "умеет" else "не умеет"
}