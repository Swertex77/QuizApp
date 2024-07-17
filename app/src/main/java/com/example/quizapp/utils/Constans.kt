package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

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

        val quest2 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_russia, "Brazil",
            "Slovenia", "Slovakia",
            "Russia",
            4
        )
        questions.add(quest2)

        val quest3 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_greece, "Netherlands",
            "Panama", "Greece",
            "Switzerland",
            3
        )
        questions.add(quest3)

        val quest4 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_germany, "Germany",
            "Sweden", "France",
            "Argentina",
            1
        )
        questions.add(quest4)

        val quest5 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_brazil, "Latvia",
            "Uruguay", "Brazil",
            "Nepal",
            3
        )
        questions.add(quest5)

        val quest6 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_argentina, "Morocco",
            "Argentina", "Mali",
            "Italy",
            2
        )
        questions.add(quest6)

        val quest7 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_peru, "Sweden",
            "Peru", "France",
            "Netherlands",
            2
        )
        questions.add(quest7)

        val quest8 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_sweden, "Italy",
            "Spain", "Zambia",
            "Sweden",
            4
        )
        questions.add(quest8)

        val quest9 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_spain, "Spain",
            "England", "Germany",
            "South Korea",
            1
        )
        questions.add(quest9)

        val quest10 = Question(
            1, "What country does this flag belong?",
            R.drawable.flag_of_netherlands, "Greece",
            "Bolivia", "Netherlands",
            "Slovakia",
            3
        )
        questions.add(quest10)
        return questions
    }
}