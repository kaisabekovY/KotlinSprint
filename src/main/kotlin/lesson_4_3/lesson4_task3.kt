package lesson_4_3

const val SEASON: String = "Winter"
const val AIR_HUMIDITY: Int = 20
const val IS_AWNING_OPEN: Boolean = true
const val IS_SUNNY: Boolean = true

fun main() {
    val seasonNow: String = "Winter"
    val airHumidityNow: Int = 20
    val isAwningOpenNow: Boolean = true
    val isSunnyNow: Boolean = true

    val areConditionsSatisfies: Boolean = SEASON != seasonNow && AIR_HUMIDITY == airHumidityNow && IS_AWNING_OPEN == isAwningOpenNow && IS_SUNNY == isSunnyNow

    println("Благоприятные ли сейчас условия для роста бобовых? $areConditionsSatisfies")
}

