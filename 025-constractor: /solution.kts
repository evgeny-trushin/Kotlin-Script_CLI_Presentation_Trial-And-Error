//error: unresolved reference: new  
class Test() {
    primary
    constructor(val test: Int)
}

val a = Test(1)
println("a equals ${a.test}")