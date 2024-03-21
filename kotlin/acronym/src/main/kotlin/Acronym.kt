object Acronym {
    fun generate(phrase: String) : String {
        val split = phrase.split(" ", "-", "_")
        val acronym = StringBuilder()
        for (word in split) {
            if (word.isNotEmpty()) {
                acronym.append(word[0].toUpperCase())
            }
        }
        return acronym.toString()
    }
}
