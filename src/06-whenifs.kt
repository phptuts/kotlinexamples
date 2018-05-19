

fun main(args: Array<String>) {

    print("Enter a name: ")

    // This is true for if statement,
    // try catch, and probably other statement
    val canEnter = when(readLine()) {
        "Bob" -> true
        "John" -> true
        else -> false
    }

    println("You Can Enter: $canEnter")

    print("Enter your age: ")
    val age = readLine().toString().toInt()

    val message = if (age > 20) "Old Enough" else "Too You"

    println("I am $message")
}