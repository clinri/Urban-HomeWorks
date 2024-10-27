class Parrot(
    type: String,
    override var swimmable: Boolean = false,
) : Bird(type = type, swimmable = swimmable) {

    override fun move() {
        println("Попугай летит напевая песню")
    }
}