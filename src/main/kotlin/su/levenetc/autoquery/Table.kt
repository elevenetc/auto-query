package su.levenetc.autoquery

import su.levenetc.autoquery.columns.Column
import su.levenetc.autoquery.columns.IntColumn
import su.levenetc.autoquery.columns.StringColumn

class Table(val name: String, vararg val columns: Column<*>)

fun int(name: String): Column<Int> {
    return IntColumn(name)
}

fun string(name: String): Column<String> {
    return StringColumn(name)
}

