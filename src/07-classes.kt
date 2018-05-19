fun main(args: Array<String>) {
    val home = House(20000, false)

    println("Is the home sold: ${home.isSold()}")
    println("Price is ${home.price}")

    // home.price = 30
}

// Some interesting facts about classes
// They are final / closed by default
class House(val price: Int, private var sold: Boolean) {

    fun isSold() = sold
}

//class RedHouse() : House(30000, false)