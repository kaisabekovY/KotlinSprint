package lesson_4_3

const val season: String = "Winter"
const val airHumidity: Int = 20
const val isAwningOpen: Boolean = true
const val isSunny: Boolean = true

fun main() {
    val seasonNow: String = "Winter"
    val airHumidityNow: Int = 20
    val isAwningOpenNow: Boolean = true
    val isSunnyNow: Boolean = true
    println("Благоприятные ли сейчас условия для роста бобовых? ${season != seasonNow && airHumidity == airHumidityNow && isAwningOpen == isAwningOpenNow && isSunny == isSunnyNow}")
}

