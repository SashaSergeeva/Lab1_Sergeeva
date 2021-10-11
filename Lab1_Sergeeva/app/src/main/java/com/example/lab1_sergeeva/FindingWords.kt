package com.example.lab1_sergeeva

class FindingWords {
    val str = "Начинать всегда стоит с того, что сеет сомнения."

    fun sortingAndOutput(): String {
        var listOfWords = str.split(" ", ",", ".")
        if (listOfWords.size < 5) listOfWords = listOf("Слов меньше 5!")
        return listOfWords.sortedWith(compareBy { it.length })
            .reversed().take( 5).toString()
            .replace("[", "").replace("]", "")
            .lowercase().replaceFirstChar { it.titlecase() }
    }
}