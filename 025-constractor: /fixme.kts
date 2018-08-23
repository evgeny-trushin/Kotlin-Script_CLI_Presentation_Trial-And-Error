//error: primary constructor call expected constructor(val test: Int)
class Test() {
    constructor(val test: Int)
}

val a = Test(1)
println("a equals ${a.test}")