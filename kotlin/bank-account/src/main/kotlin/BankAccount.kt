class BankAccount {
    private var isOpen: Boolean = true
    var balance: Int = 0
        get() {
            check(isOpen); return field
        }

    fun adjustBalance(amount: Int) =
        synchronized(balance) {
            balance += amount
        }

    fun close() {
        isOpen = false
    }
}
