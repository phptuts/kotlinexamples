
// inline makes it so that it does not have to create
// an object o call the function thus running it faster
/** inline **/ fun callMe(phone: (String) -> String) = phone("555-5555")

fun main(args: Array<String>) {
    // It is implicitly there because the function has one argument
    // You don't need parentheses if it takes in one argument
    // You don't need the return statement
    // because it infers it's the last line is what is returned
    println(callMe { "Calling $it" })
}