package lesson_4_3

fun main() {
    var season: String = "Winter"
    var airHumidity: Int = 20
    var isAwningOpen: Boolean = true
    var isSunny: Boolean = true

    println("Благоприятные ли сейчас условия для роста бобовых? ${season != "Winter" && airHumidity == 20 && isAwningOpen && isSunny}")
}

