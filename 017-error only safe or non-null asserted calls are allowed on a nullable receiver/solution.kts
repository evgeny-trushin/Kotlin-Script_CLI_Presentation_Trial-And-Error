//error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver
class Test(var flag: Boolean)

var a: Test? = null
a = Test(true)
a?.flag = false
println("a.isFlag equals ${a?.flag}")