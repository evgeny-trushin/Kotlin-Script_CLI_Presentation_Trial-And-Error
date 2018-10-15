//error: expecting '->'
if (args.isNotEmpty()) {
    println("Args: " +
            when (args[0]) {
                "HELLO_WORLD" -> "Hello"
                else "Hi!"
            })
} else {
    println("Args are empty")
}