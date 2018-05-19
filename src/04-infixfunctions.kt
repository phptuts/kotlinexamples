
infix fun String.addTogetherWithSpace(name: String) = "$this $name"

fun main(args: Array<String>) {
    println("bill".addTogetherWithSpace("smith"))
    println("Hello" addTogetherWithSpace "world")

    // These are technically "infix operators" but same concept
    // .. is in infix operator
    // 1.rangeTo(20) == 1..20
    for (b in 1.rangeTo(20)) {
        println("Long Hand $b")
    }

    for (b in 1..20) {
        println("Short hand $b")
    }
}