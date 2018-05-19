
fun Int.add2() = this + 2

fun Int.isDivisible(divider: Int) = this % divider == 0

fun main(args: Array<String>) {
    println("Example 1 ${4.isDivisible(2)}")
    println("Example 2 ${2.add2()}")
}