interface Test {
    fun message(): String
    fun value(): Int
}

fun main() {
    val t = TestImpl()
    println(t.message())
    println(t.value())
}