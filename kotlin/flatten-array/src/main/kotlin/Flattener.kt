object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        return source.flatMap { element ->
            when (element) {
                is Collection<Any?> -> flatten(element)
                else -> listOfNotNull(element)
            }
        }
    }
}