package com.example.katakotlin

fun makeComplementDna(dna : String) : String {
    var newDna = ""
    for (i in dna.indices) {
        when (dna[i]) {
            'A' -> newDna += 'T'
            'T' -> newDna += 'A'
            'C' -> newDna += 'G'
            'G' -> newDna += 'C'

        }
    }
    return newDna
}

fun makeComplement(dna: String): String {
    val complementMap = mapOf('A' to 'T', 'T' to 'A', 'C' to 'G', 'G' to 'C')
    return dna.map { complementMap[it] }.joinToString("")
}
