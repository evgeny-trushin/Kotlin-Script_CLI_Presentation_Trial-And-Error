//java.lang.ClassCastException: Fixme$Home cannot be cast to Fixme$Do
interface Relax {
    public fun getAction(): String
}

interface Do {
    public fun getOptions(): String
}

interface Basic {
    fun getBasicOptions() = "Nope";
}

class Work() : Do, Basic {
    override fun getOptions() = "Do, Complete"
}

class Home() : Relax, Basic {
    override fun getAction() = "Home";
}

val a = Home()
val b = Work()

fun showOptions(c: Basic) {
    if (c is Do) {
        println("The options of ${a.javaClass.kotlin} are:" + c.getOptions())
    } else {
        println("There are no options of ${a.javaClass.kotlin}: ")
    }
}

showOptions(a)
showOptions(b)