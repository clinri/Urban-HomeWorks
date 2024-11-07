fun main() {
    task1()
    task2()
    task3()
}

/**
 * 1. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 */
fun task1() {
    val stringArray = arrayOf("яблоко", "грейпфрут", "помидор", "апельсин")
    var maxLength = 0
    var maxLengthIndex = 0
    for (i in stringArray.indices) {
        val lengthString = stringArray[i].length
        if (lengthString > maxLength) {
            maxLength = lengthString
            maxLengthIndex = i
        }
    }
    val result = stringArray[maxLengthIndex]
    println("Самое длинное слово \"$result\" в котором ${result.length} букв")
}

/**
 * 2. Посчитать сумму элементов побочной диагонали матрицы 4х4.
 */
fun task2() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 0, 1, 2),
        arrayOf(3, 4, 5, 6),
    )
    var sum = 0
    for (i in matrix.indices) {
        sum += matrix[matrix.size - 1 - i][i]
    }
    println("Сумма элементов главной диагонали = $sum")
}

/**
 * 3. Написать абстрактный класс Printer со своими свойствами и функциями.
 * В функции main создать несколько объектов Printer.
 */
fun task3() {
    printer1()
    printer2()
}

private fun printer1() {
    val printer1 = object : Printer(
        vendor = "Epson",
        model = "RT-455",
        maxCountPaper = 20,
        tonerResidue = 90,
    ) {

        override fun print(text: String) {
            val pageArray = text.split("===")
            for (i in pageArray.indices) {
                println("напечатана страница ${i + 1} с текстом \"${pageArray[i]}\"")
                tonerResidue -= 2
            }
        }

        override fun getInfo() {
            println("Принтер $vendor $model, лоток для бумаги вмещает $maxCountPaper, остаток тонера $tonerResidue %")
        }

        override fun printTestPage() {
            println("напечатана тестовая страница")
            tonerResidue -= 1
        }
    }

    printer1.getInfo()
    printer1.print(
        "Жил старик со своею старухой" +
                "===" +
                "У самого синего моря;" +
                "===" +
                "Они жили в ветхой землянке" +
                "===" +
                "Ровно тридцать лет и три года."
    )
    printer1.printTestPage()
    printer1.getInfo()
}

private fun printer2() {
    val printer2 = object : Printer(
        vendor = "HP",
        model = "F-32",
        maxCountPaper = 40,
        tonerResidue = 30,
    ) {

        override fun print(text: String) {
            val pageArray = text.split("\n")
            for (i in pageArray.indices) {
                println("Напечатана страница ${i + 1} с текстом \"${pageArray[i]}\"")
                tonerResidue -= 2
            }
        }

        override fun getInfo() {
            println("Принтер $vendor $model, лоток для бумаги вмещает $maxCountPaper, остаток тонера $tonerResidue %")
        }

        override fun printTestPage() {
            println("Напечатана тестовая страница")
            tonerResidue -= 1
        }
    }

    printer2.getInfo()
    printer2.print(
        "Жил старик со своею старухой\n" +
                "У самого синего моря;\n" +
                "Они жили в ветхой землянке\n" +
                "Ровно тридцать лет и три года."
    )
    printer2.printTestPage()
    printer2.getInfo()
}
