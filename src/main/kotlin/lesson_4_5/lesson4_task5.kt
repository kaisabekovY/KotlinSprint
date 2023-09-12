package lesson_4_5

const val maxCrewAmount = 70
const val minCrewAmount = 55
const val minProvisionBox = 50
const val isWeatherSatisfies: Boolean = true
const val isShipNotDamaged: Boolean = true

fun main() {
    println("Is ship fixed? Write true or false")
    val isShipFixed: Boolean = readlnOrNull().toBoolean()

    println("Amount of people on ship? Type amount")
    var shipCrew: Int? = readlnOrNull()?.toIntOrNull()
    if(shipCrew == null) {
        shipCrew = 0
    }

    println("Amount of provision? Type amount")
    var amountOfProvision: Int? = readlnOrNull()?.toIntOrNull()
    if(amountOfProvision == null) {
        amountOfProvision = 0
    }

    println("is Weather Good? Write true or false")
    val isWeatherGood: Boolean = readlnOrNull().toBoolean()

    val firstCondition: Boolean = (isShipNotDamaged == isShipFixed) && (shipCrew >= minCrewAmount && shipCrew <= maxCrewAmount) && (isWeatherGood || isWeatherSatisfies) && (amountOfProvision > minProvisionBox)

    val secondCondition: Boolean = (isShipNotDamaged || isShipFixed) && (shipCrew == maxCrewAmount) && (isWeatherGood == isWeatherSatisfies) && (amountOfProvision > minProvisionBox)

    val isReadyToGo: Boolean = firstCondition || secondCondition

    println(isReadyToGo)
}