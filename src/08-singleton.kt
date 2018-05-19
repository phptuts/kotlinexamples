interface ControlSomething {
    fun onProgress(progress: Int)

    fun onFinish()
}

object OnlyOne {
    fun doSomething() = 4
}

fun main(args: Array<String>) {
    val on = OnlyOne

    val another = OnlyOne

    println(on == another)

    // Example of an anonymous class used a lot
    // for compatible stuff with java android api.
    object: ControlSomething {
        override fun onProgress(progress: Int) {
        }

        override fun onFinish() {
        }
    }
}