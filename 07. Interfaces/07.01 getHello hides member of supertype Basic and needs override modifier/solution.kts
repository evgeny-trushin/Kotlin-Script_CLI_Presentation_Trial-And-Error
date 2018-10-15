//error: 'getHello' hides member of supertype 'Basic' and needs 'override' modifier
interface Basic {
    public fun getHello(): String;
}

class Work(var flag: Boolean) : Basic {
    override fun getHello() = "Work";

}

class Home() : Basic {
    override fun getHello() = "Home";
}

var a: Home? = Home()
println("a.isFlag equals ${a?.getHello()}")