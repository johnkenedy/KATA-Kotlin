package com.example.katakotlin

fun nbYear(p0: Int, percent: Double, aug: Int, p: Int): Int {
    var year = 0
    var population = p0
    while (population < p) {
        population = (population + (population * percent / 100 + aug)).toInt()
        year++
    }
    return year
}

fun nbYear2(pp0: Int, percent: Double, aug: Int, p: Int): Int =
    generateSequence(pp0.toDouble()) {
        it * (1 + percent / 100) + aug
    }.takeWhile { it < p }
        .count()