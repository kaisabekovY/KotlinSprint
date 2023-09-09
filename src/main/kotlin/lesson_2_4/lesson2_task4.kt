package lesson_2_4

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buff: Double = 0.2

    val bonusCrystalOre: Double = crystalOre * buff
    val bonusIronOre: Double = ironOre * buff

    println("Volume of crystal ore is ${(crystalOre + bonusCrystalOre).toInt()}. ${bonusCrystalOre.toInt()} of them got using buff\n" +
            "Volume of iron ore is ${(ironOre + bonusIronOre).toInt()}. ${bonusIronOre.toInt()} of them got using buff")
}