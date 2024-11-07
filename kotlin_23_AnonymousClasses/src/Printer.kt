abstract class Printer(
    val vendor: String,
    val model: String,
    val maxCountPaper: Int,
    var tonerResidue: Int,
) {
    abstract fun print(text: String)
    abstract fun getInfo()
    abstract fun printTestPage()
}