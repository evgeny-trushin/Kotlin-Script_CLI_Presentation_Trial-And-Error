//023-lazy-error: Failed to generate property defaultValue Cause Don't know how to generate outer expression for lazy class Companion
import kotlin.reflect.KProperty

interface TimeOfOperation {
	fun getTime():Int
}

enum class Home(var min:Int):TimeOfOperation {

	RELAX(59), CLEAN(58);
	override fun getTime()=min
    
    companion object: TimeOfOperation {
        var defaultValue: TimeOfOperation by lazy {RELAX}
        override fun getTime()=defaultValue.getTime()

    }
}

fun showTimeByDefault(c: TimeOfOperation){
		println("Time to clean at ${c.javaClass.getSimpleName()}: ${c.getTime()} min ") 	
}                           

showTimeByDefault(Home)

operator fun Any.setValue(companion: Home.Companion, property: KProperty<*>, timeOfOperation: TimeOfOperation) {}