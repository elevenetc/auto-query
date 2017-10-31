package su.levenetc.autoquery.nodes

open interface ExpressionsGroup {
    fun addUnion()
    fun removeLast(columnName:String)
}