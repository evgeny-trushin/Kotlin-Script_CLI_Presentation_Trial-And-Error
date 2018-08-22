//type mismatch: 'return' is not allowed here
fun fixme1(a: Int) = a + 1
fun fixme2(a: Int): Int { return a + 1 }
fun fixme3(a: Int): Int = a + 1
println(fixme1(1))
println(fixme2(1))
println(fixme3(1))
