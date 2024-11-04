data class Film(
    val name: String,
    val time: String,
    val listPlaces: List<Int> = List(20) { it + 1 },
)
