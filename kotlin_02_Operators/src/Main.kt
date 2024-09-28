const val PI = 3.14

fun main() {
    val a = 5
    val b = 2
    val d = 6
    val sm = 120
    println("Квадрат со стороной а=$a: P=${perimeterSquare(a)} | S=${areaSquare(a)}")
    println("Прямоугольник со сторонами а=$a, b=$b: P=${perimeterRectangle(a, b)} | S=${areaRectangle(a, b)}")
    println("Окружность с диаметром d=$d: L=${lengthCircle(d)}")
    println("$sm сантиметров это L=${getMeters(sm)} метров")
    println("На отрезке А=$a отрезок B=$b поместится раз: ${getCountB(a, b)}")
}

/**
 * Дана сторона квадрата a. Найти его периметр P=4∗a.
 */
fun perimeterSquare(a: Int): Int {
    return 4 * a
}

/**
 * Дана сторона квадрата a. Найти его площадь S=a*a
 */
fun areaSquare(a: Int): Int {
    return a * a
}

/**
 * Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
 */
fun areaRectangle(a: Int, b: Int): Int {
    return a * b
}

fun perimeterRectangle(a: Int, b: Int): Int {
    return 2 * (a + b)
}

/**
 * Дан диаметр окружности d. Найти ее длину L=π∗d. В качестве значения π использовать константу 3.14.
 */
fun lengthCircle(d: Int): Double {
    return PI * d
}

/**
 *  Дано расстояние L в сантиметрах. Используя операцию деления нацело,
 *  найти количество полных метров в нем (1 метр = 100 см).
 */
fun getMeters(centimeters: Int): Int {
    return centimeters / 100
}

/**
 * Даны целые положительные числа A и B (A>B). На отрезке длины A размещено максимально возможное количество отрезков
 * длины B (без наложений). Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
 */
fun getCountB(a: Int, b: Int): Int {
    return a / b
}