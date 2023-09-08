package lesson_2_3

fun main() {
    val trainDepartureHour: Int = 9
    val trainDepartureMinute: Int = 39
    val travelTime: Int = 1000

    val departureTimeInMinutes: Int = (trainDepartureHour * 60) + trainDepartureMinute
    val arrivalTimeInMinutes: Int = departureTimeInMinutes + travelTime

    val trainArrivalHour: Int = if(arrivalTimeInMinutes / 60 > 24) (arrivalTimeInMinutes / 60) % 24 else arrivalTimeInMinutes / 60
    val trainArrivalMinute: Int = arrivalTimeInMinutes % 60

    val arrivalTime = String.format("%02d:%02d",trainArrivalHour,trainArrivalMinute)

    println("Arrival time is: $arrivalTime")
}