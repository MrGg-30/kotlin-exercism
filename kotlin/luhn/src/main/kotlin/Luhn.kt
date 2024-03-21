object Luhn {

    fun isValid(candidate: String): Boolean {
        if (candidate.length <= 1) return false

        val cleanNumber = candidate.filter { it.isDigit() || it != ' ' }
        if (cleanNumber.any { !it.isDigit() } || cleanNumber.length == 1) return false

        val sumOfDoubledDigits = cleanNumber.reversed()
            .mapIndexed { index, char ->
                val digit = char.toString().toIntOrNull() ?: return false
                if (index % 2 == 1) {
                    val doubled = digit * 2
                    if (doubled > 9) doubled - 9 else doubled
                } else {
                    digit
                }
            }
            .sum()
        return sumOfDoubledDigits % 10 == 0
    }
}
