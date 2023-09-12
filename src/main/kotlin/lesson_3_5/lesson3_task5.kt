package lesson_3_5

fun main() {
    var moveInfo: String = "D2-D4;0"

    val parts: List<String> = moveInfo.split(";")
    val moveData: List<String> = parts[0].split("-")

    var moveNumber: String = parts[1]
    var from: String = moveData[0]
    var to: String = moveData[1]

    println("""
        From: $from
        To: $to
        Number: $moveNumber
        """.trimIndent())
}