fun main() {
    task1(4.0, 9.0)
    task2(45.0)
    task3(1, 2, 3, 4)
    task4()
    task5()
}

/**
 *
 * 2. Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L=π∗D, S=π∗D2/4. В качестве значения π использовать 3.14.
 * 3. Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2). Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
 * 4. Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
 * 5. Дано целое число n = 20. Уменьшая его до 0, вывести на экран только четные числа.
 */

/**
 * 1. Даны два числа a и b. Найти их среднее арифметическое.
 */
fun task1(a: Double, b: Double) {
    println("${(a + b) / 2}")
}

/**
 * 2. Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг,
 * учитывая, что L=π∗D, S=π∗D2/4. В качестве значения π использовать 3.14.
 */
fun task2(s: Double) {
    val pi = 3.14
    val d = Math.sqrt(s / 3.14 * 4)
    val l = pi * d
    println("Для круга с S = $s диаметр D = $d длина окружности L = $l")
}

/**
 * 3. Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2).
 * Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
 */
fun task3(x1: Int, y1: Int, x2: Int, y2: Int) {
    val a = Math.abs(x1 - x2)
    val b = Math.abs(y1 - y2)
    val p = (a + b) * 2
    val s = a * b
    println("периметр = $p, площадь = $s")
}

/**
 * 4. Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
 */
fun task4() {
    var number = 1
    repeat(9) {
        print("$number ")
        number *= 2
    }
    println(number)
}

/**
 * 5. Дано целое число n = 20. Уменьшая его до 0, вывести на экран только четные числа.
 */
fun task5() {
    for (i in 20 downTo 0) {
        if (i % 2 == 0) print("$i ")
    }
}