//error: expecting '->'
if (args.size > 0) {
    println("Args: ${when (args.get(0)) {"HELLO_WORLD" -> "|Hello World|"
        else -> "Hi!"
    }}")
} else {
    println("Args are empty")
}
