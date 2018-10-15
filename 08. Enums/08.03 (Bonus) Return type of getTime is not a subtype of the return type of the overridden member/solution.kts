//error: return type of getTime is not a subtype of the return type of the overridden member
interface TimeOfOperation {
    fun getTime(): Int
}

enum class Home(var min: Int) : TimeOfOperation {

    RELAX(59), CLEAN(58);

    override fun getTime() = min

    companion object : TimeOfOperation {
        override fun getTime() = RELAX.getTime()
    }
}

fun showTimeByDefault(c: TimeOfOperation) {
    println("Time to clean at ${c.javaClass.simpleName}: ${c.getTime()} min ")
}

showTimeByDefault(Home)
