abstract class Shop(
    val name: String,
    val employers: Int,
) {

    abstract fun saleProduct(nameProduct: String)
    abstract fun calculationDiscount(): Int

    fun paySalary() {
        println("Зарплата выплачена $employers сотрудникам магазина $name")
    }
}

class Magnit(
    name: String,
    employers: Int,
) : Shop(name, employers) {

    override fun saleProduct(nameProduct: String) {
        println("Товар $nameProduct продан со скидкой ${calculationDiscount()} в магазине $name")
    }

    override fun calculationDiscount(): Int {
        return if (employers > 10) 5 else 2
    }
}

class Pyaterochka(
    name: String,
    employers: Int,
) : Shop(name, employers) {

    override fun saleProduct(nameProduct: String) {
        println("Товар $nameProduct продан со скидкой ${calculationDiscount()} в магазине $name с доставкой на дом")
    }

    override fun calculationDiscount(): Int {
        return if (employers > 20) 20 else 10
    }
}