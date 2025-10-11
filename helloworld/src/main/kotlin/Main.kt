import com.diacht.ktest.compose.startTestUi
import org.example.helloworld.BuildConfig
import kotlin.math.*

fun seed(): String = "Makarenko-Ant"

fun labNumber(): Int = BuildConfig.LAB_NUMBER

fun iCalculate  (
    x0: Int = 46,
    x1: Int = -60,
    x2: Int = 55,
    x3: Int = -112
): Double {
    val x = x0*x0 + x1*x1 + x2*x2 + x3*x3
    val res: Double = sin(x.toDouble())
    return res
}

fun dCalculate(
    x0: Double = -57.27,
    x1: Double = 82.49,
    x2: Double = -39.99,
    x3: Double = -83.52,
    x4: Double = 6.05
): Double {
    val x = minOf(abs(x0), abs(x1), abs(x2), abs(x3), abs(x4))
    val res = cbrt(x)
    return res
}

fun strCalculatet(
    x0: String,
    x1: String
): Int {
    require(x0.length == x1.length && x0.length % 2 == 0) {
        "Рядки повинні мати однакову парну довжину"
    }
    var diffCount: Int = 0;
    for (i in x0.indices step 2) {
        val c0 = x0[i]
        val c1 = x1[i]
        val areEqual = when {
            (c0 == 'T' && c1 == 'J') || (c0 == 'J' && c1 == 'T') -> true
            else -> c0 == c1
        }
        if (!areEqual) {diffCount++}
    }
    return diffCount
}

fun main(args: Array<String>) {
    //println("Лабораторна робота №${labNumber()} користувача ${seed()}")
    println(iCalculate())
    println(dCalculate())
    println(strCalculatet("ATCCTJ","AJGJJT"))
    //startTestUi(seed(), labNumber())

}