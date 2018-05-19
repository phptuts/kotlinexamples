
fun add2ToANumber(num: Int): Int {
    return num + 2
}

fun add2ToANumberShort(num: Int) = num + 2

fun main(args: Array<String>) {
    println("Example 1 ${add2ToANumber(2)}")
    println("Example 2 ${add2ToANumberShort(2)}")
}