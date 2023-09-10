package lesson_3_4

fun main() {
    var moveNumber: Int = 1
    var from: String = "E2"
    var where: String = "E4"

    println("[$from-$where;$moveNumber]")

    moveNumber = 2
    from = "D2"
    where = "D3"

    println("[$from-$where;$moveNumber]")
}