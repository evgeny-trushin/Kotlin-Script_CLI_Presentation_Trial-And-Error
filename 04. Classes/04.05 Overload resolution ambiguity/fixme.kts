//error: overload resolution ambiguity: public constructor Info(nameA: String) defined in Fixme.Info
data class Info(val nameB: String) {
    constructor(nameA: String) : this(nameB=nameA)
}

println(Info(nameA = "nameA").nameB)