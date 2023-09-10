package lesson_3_5

fun main() {
    var moveInfo: String = "D2-D4;0"

    var moveNumber: Int = moveInfo[moveInfo.length - 1].toString().toInt()
    var from: String = moveInfo[0].toString() + moveInfo[1].toString()
    var where: String = moveInfo[3].toString() + moveInfo[4].toString()

    println("""
        From: $from
        Where: $where
        Number: $moveNumber
        """.trimIndent())
}