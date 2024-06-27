package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_italy, "Italy",
            "Spain", "France",
            "South Korea",
            1
        )
        questions.add(quest1)
        return questions
    }
}