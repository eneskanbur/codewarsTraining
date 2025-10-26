import kyu5.DirectionsReduction
import kyu6.FindTheParityOutlier
import kyu7.AlternateCapitalization

fun main() {

    val a = DirectionsReduction()
    println(a.dirReduc(arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")).contentToString())
}
