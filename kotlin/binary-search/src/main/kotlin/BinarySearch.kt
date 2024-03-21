object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        var left =  0
        var right = list.size - 1
        while (left <= right) {
            val middle = left + (right - left) / 2

            if (list[middle] == item) return middle

            if (list[middle] > item) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        throw NoSuchElementException()
    }
}
