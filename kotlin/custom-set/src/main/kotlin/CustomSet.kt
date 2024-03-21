class CustomSet(vararg elements: Int) {

    private val items: MutableList<Int> = elements.toMutableList()

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun isSubset(other: CustomSet): Boolean = items.all { other.contains(it) }

    fun isDisjoint(other: CustomSet): Boolean = items.none { other.contains(it) }

    fun contains(other: Int): Boolean = items.contains(other)

    fun intersection(other: CustomSet): CustomSet {
        return CustomSet(*items.filter { other.contains(it) }.toIntArray())
    }

    fun add(other: Int) {
        if (!items.contains(other)) {
            items.add(other)
        }
    }

    override fun equals(other: Any?): Boolean = other is CustomSet &&
            this.isSubset(other) && other.isSubset(this)

    operator fun plus(other: CustomSet): CustomSet {
        val result = CustomSet()
        result.items.addAll(items)
        result.items.addAll(other.items)
        return result
    }

    operator fun minus(other: CustomSet): CustomSet {
        val result = CustomSet()
        result.items.addAll(items)
        result.items.removeIf { other.contains(it) }
        return result
    }
}
