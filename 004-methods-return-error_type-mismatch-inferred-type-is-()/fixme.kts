// type mismatch: inferred type is ()
fun fixme1(a: Int)={ return a+1 }
fun fixme2(a: Int):Int{ return a+1 }
fun fixme3(a: Int):Int=a+1
println("The result of fixme1 equals "+fixme1(1))
println("The result of fixme2 equals "+fixme2(1))
println("The result of fixme3 equals "+fixme3(1))