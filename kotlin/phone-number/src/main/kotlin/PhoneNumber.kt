class PhoneNumber(number: String) {

    private val digits = number.filter { it.isDigit() }

    init {
        require(digits.matches("""1?[2-9]\d\d[2-9]\d{6}""".toRegex()))
    }

    val number: String = if (digits.length == 10) digits else digits.substring(1)
}