//error: classifier 'Home' does not have a companion object, and thus must be initialized here   
interface TimeOfOperation {
	public fun getTime():Int
}

enum class Home(public var min:Int):TimeOfOperation {

	RELAX(59), CLEAN(58);
	override fun getTime()=min
}

fun showOptions(c: TimeOfOperation){
		println("Time to clean at ${c.javaClass.getSimpleName()}: ${c.getTime()} min ") 	
}                           

showOptions(Home.CLEAN)
