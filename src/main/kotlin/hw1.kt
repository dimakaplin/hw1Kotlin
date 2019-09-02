fun main() {
    println(calcFee(100.toDouble(), 5.toDouble(), false))
}

fun calcFee(amount: Double, total: Double, exclusive: Boolean = false): Double {
    var pr = when {
        total > 0 && total <= 1000 -> 0.3
        total > 1001 && total <= 10000 -> 0.25
        total > 10001 && total <= 50000 -> 0.20
        total > 50000 -> 0.15
        else -> 0.toDouble()
    }
    pr = if (exclusive) pr - 0.5 else pr
    return amount - (amount * pr);
}


