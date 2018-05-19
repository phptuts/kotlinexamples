fun main(args: Array<String>) {
    /** Variable val vs var Use Val where possible **/
//    val iLikePizza = true
//    var iLikeCats = false
//
//    iLikeCats = true
//    iLikePizza = false

     /** Nullable Variables Scary ~) **/

    var nullableVariable: Boolean?

    nullableVariable = true

    println("$nullableVariable")

    /** Cool things you can do with strings **/

    val color = "blue"

    println("My favorite color is $color")

    fun isOldCouch(age: Int) = age > 10

    println("My couch is ${isOldCouch(7)}")
}