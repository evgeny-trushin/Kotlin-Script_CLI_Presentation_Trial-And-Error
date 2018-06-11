//error: 'getHello' hides member of supertype 'Basic' and needs 'override' modifier
interface Basic {
	public fun getHello():String;
}
class Work(var flag: Boolean):Basic {
	public fun getHello()="Work";

}
class Home():Basic {
	public fun getHello()="Home";
}
var a:Home?=Home()
println("a.isFlag equals ${a?.getHello()}")