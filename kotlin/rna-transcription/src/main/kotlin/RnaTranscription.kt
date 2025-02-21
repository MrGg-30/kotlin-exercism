fun transcribeToRna(dna: String): String =
    dna.map {
        when (it) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> ' '
        }
    }.joinToString("")