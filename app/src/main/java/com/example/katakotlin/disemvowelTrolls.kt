package com.example.katakotlin

fun disemvowel(str: String): String = str.filterNot { it in "aeiouAEIOU" }
