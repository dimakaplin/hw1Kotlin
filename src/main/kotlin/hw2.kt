fun main() {
    println(calcBodyIndex(84.toDouble(), 1.7))
}

fun calcBodyIndex(weight: Double, growth: Double): String {
    val index = weight / (growth * growth)

    return when {
        index <= 15.99 -> "Выраженный дефицит массы тела"
        index in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        index in 18.5..24.99 -> "Норма"
        index in 24.99..30.0 -> "Избыточная масса тела (предожирение)"
        index in 30.0..35.0 -> "Ожирение"
        index in 35.0..40.0 -> "Ожирение резкое"
        index > 40 -> "Очень резкое ожирение"
        else -> "Вас не существует"
    }
}