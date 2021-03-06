package su.levenetc.autoquery.nodes

import su.levenetc.autoquery.getShortestCompletable

open class OrNode(private val variants: List<String>) : Node() {

    override fun complete(): Boolean {
        if (isCompleted()) return true

        val completable = getShortestCompletable(value, variants)

        return if (completable.isEmpty()) {
            false
        } else {
            value.setLength(0)
            value.append(completable)
            setCompleted()
            true
        }
    }

    override fun addChar(char: Char): Boolean {
        if (isCompleted()) return false
        value.append(char)
        return true
    }

    override fun deleteChar(): Boolean {
        return if (!value.isEmpty()) {
            value.setLength(value.length - 1)
            true
        } else {
            false
        }
    }
}