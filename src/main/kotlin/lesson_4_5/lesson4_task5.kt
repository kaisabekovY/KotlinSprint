package lesson_4_5

const val MAX_CREW_AMOUNT = 70
const val MIN_CREW_AMOUNT = 55
const val MIN_PROVISION_AMOUNT = 50
const val IS_SHIP_NOT_DAMAGED: Boolean = true

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

    val firstCondition: Boolean = (IS_SHIP_NOT_DAMAGED == isShipFixed) && (shipCrew >= MIN_CREW_AMOUNT && shipCrew <= MAX_CREW_AMOUNT) && isWeatherGood && (amountOfProvision > MIN_PROVISION_AMOUNT)

    val secondCondition: Boolean = (IS_SHIP_NOT_DAMAGED || isShipFixed) && (shipCrew == MAX_CREW_AMOUNT) && isWeatherGood && (amountOfProvision > MIN_PROVISION_AMOUNT)

    val isReadyToGo: Boolean = firstCondition || secondCondition

    println(isReadyToGo)
}