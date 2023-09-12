package lesson_4_2

fun main() {
    val maxWeight: Int = 100
    val minWeight: Int = 35

    var weight: Int = 20
    var volume: Int = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= minWeight && weight <= maxWeight) and (volume < 100)}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= minWeight && weight <= maxWeight) and (volume < 100)}")
}