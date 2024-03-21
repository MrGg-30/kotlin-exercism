class Dna(sq: String) {

    private val nucleotides = mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

    val nucleotideCounts = sq.fold(nucleotides) {
            acc, c ->
        val curr = acc[c]
        require(curr != null)
        acc.plus(c to (curr + 1))
    }
}