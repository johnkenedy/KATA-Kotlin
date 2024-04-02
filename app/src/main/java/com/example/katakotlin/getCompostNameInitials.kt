package com.example.katakotlin

fun getCompostNameInitials(name: String): String {
    if (name.isEmpty()) return ""
    val words = name
        .split(" ")
        .map { it.first().uppercase() }
    return words.joinToString(".")
}
