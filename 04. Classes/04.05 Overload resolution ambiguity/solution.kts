//error: overload resolution ambiguity: public constructor Info(nameA: String) defined in Fixme.Info
data class Info(val nameB: String) {
    constructor(nameA: Any) : this(nameA as String)
}

println(Info(nameA = "nameA").nameB)