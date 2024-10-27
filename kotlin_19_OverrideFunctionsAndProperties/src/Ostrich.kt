class Ostrich(
    type: String,
    override var flyable: Boolean = false,
    override var swimmable: Boolean = false,
) : Bird(type = type) {

    override fun move() {
        println("Страус бежит высоко поднимая ноги")
    }
}