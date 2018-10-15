//error: expecting an element println("Args: " + $args[0])
if (args.isNotEmpty()) {
    println("Args: " + args[0])
    println("Args: " + args.get(0))
    println("Args: ${args[0]}")
    println("Args: ${args.get(0)}")
} else {
    println("Args are empty")
}