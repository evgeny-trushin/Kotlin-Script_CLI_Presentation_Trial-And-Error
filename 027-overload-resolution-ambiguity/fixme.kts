//error: overload resolution ambiguity: public constructor Info(nameA: String) defined in Fixme.Info
data class Info(val nameB: String) {
    constructor(nameA: String) : this(nameA)
}

println("a equals ${Info(nameA = "nameA").nameB}")