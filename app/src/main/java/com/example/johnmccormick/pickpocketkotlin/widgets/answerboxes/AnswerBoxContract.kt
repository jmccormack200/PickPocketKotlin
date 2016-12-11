package com.example.johnmccormick.pickpocketkotlin.widgets.answerboxes

interface AnswerBoxContract {
    interface View {
        fun showCorrectAtPositionOne()
        fun showCorrectAtPositionTwo()
        fun showCorrectAtPositionThree()
        fun showCorrectAtPositionFour()
        fun showRightNumberWrongPositionFour()
        fun showRightNumberWrongPositionThree()
        fun showRightNumberWrongPositionTwo()
        fun showRightNumberWrongPositionOne()
        fun showAllCorrect()
        fun showIncorrectAtPositionOne()
        fun showIncorrectAtPositionTwo()
        fun showIncorrectAtPositionThree()
        fun showIncorrectAtPositionFour()
    }

    interface Presenter{
        fun setView(view: AnswerBoxContract.View)
        fun setNumberCorrect(numberCorrectRightPosition: Int, numberCorrectWrongPosition: Int)
        fun setAllCorrect()
        fun showAllIncorrect()
    }
}

