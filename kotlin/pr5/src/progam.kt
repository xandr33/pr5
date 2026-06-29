
import kotlin.math.*



fun calcDist(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))
}
fun calcMet(x1: Double, y1: Double, x2: Double, y2: Double): Pair<Double, Double> {
    val midX = (x1 + x2) / 2.0
    val midY = (y1 + y2) / 2.0
    return Pair(midX, midY)
}
fun main() {
    println("cord 1 tochki(x1, y1):")
    val x1 = readln().toDouble()
    val y1 = readln().toDouble()

    println("cord 2 tochki(x2, y2):")
    val x2 = readln().toDouble()
    val y2 = readln().toDouble()

    val distashn = calcDist(x1, y1, x2, y2)
    println("rastoyani mesdutochkami: $distashn")
    val (midX, midY) = calcMet(x1, y1, x2, y2)
    println("kordinati seredini otreska: ($midX, $midY)")
}