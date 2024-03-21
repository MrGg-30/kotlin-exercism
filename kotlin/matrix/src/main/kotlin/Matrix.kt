class Matrix(private val matrixAsString: String) {

    private val matrix: List<List<Int>> = matrixAsString.split("\n")
        .map{
            row -> row.split(" ")
            .map { it.toInt() }
        }


    fun column(colNr: Int): List<Int> {
        return matrix.map { it ->it[colNr - 1] }.toList()
    }

    fun row(rowNr: Int): List<Int> {
        return matrix[rowNr - 1]
    }
}
