package lesson_1

fun main() {
    val timeInSpace = 6400
    val hours = timeInSpace / 3600
    val secondsRemainedAfterHours = timeInSpace % 3600
    val minutes = secondsRemainedAfterHours / 60
    val seconds = secondsRemainedAfterHours % 60

    val output : String = String.format("%02d:%02d:%02d", hours,minutes,seconds)
    println(output)
}