class IsbnVerifier {

    fun isValid(number: String): Boolean {
        val cleanNumber = number.filter { it.isDigit() || (it == 'X' && it == number.last()) }

        if (cleanNumber.length != 10) return false

        var sum = 0
        var multiplier = 10

        for (char in cleanNumber) {
            val value = if (char == 'X') 10 else char.toString().toIntOrNull() ?: return false
            sum += value * multiplier
            multiplier--
        }

        return sum % 11 == 0
    }

}
