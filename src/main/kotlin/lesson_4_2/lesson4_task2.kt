package lesson_4_2

const val maxWeight: Int = 100
const val minWeight: Int = 35
const val maxVolume: Int = 100

fun main() {
    var weight: Int = 20
    var volume: Int = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= minWeight && weight <= maxWeight) and (volume < maxVolume)}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= minWeight && weight <= maxWeight) and (volume < maxVolume)}")
}