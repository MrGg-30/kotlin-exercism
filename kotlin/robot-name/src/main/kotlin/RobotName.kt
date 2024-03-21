class Robot {
    companion object {
        private val listName = mutableSetOf<String>()
    }

    var name = getNewName()

    fun reset() {
        name = getNewName()
    }
    private fun generatedName(): String {
        val letters = ('A'..'Z').shuffled().take(2).joinToString("")
        val numbers = (0..9).shuffled().take(3).joinToString("")
        return "$letters$numbers"
    }


    private fun getNewName(): String {
        var newName: String
        do {
            newName = generatedName()
        } while (!listName.add(newName))
        return newName
    }
}