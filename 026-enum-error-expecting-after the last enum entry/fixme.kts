//error: expecting ';' after the last enum entry or '}'   
interface TimeOfOperation {
    fun getTime(): Int
}

enum class Home(var min: Int) : TimeOfOperation {
    RELAX(59), CLEAN(58)

    override fun getTime() = min
}

fun showOptions(c: TimeOfOperation) {
    println("Time to clean at ${c.javaClass.getSimpleName()}: ${c.getTime()} min ")
}

showOptions(Home.CLEAN)
