package com.example.quizapp.models

data class quiz(
    var id: String = "",
    var title: String = "",
    var questions: MutableMap<String, questions> = mutableMapOf()
)