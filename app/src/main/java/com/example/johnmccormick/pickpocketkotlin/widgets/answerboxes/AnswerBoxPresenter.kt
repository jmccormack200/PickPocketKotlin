package com.example.johnmccormick.pickpocketkotlin.widgets.answerboxes

class AnswerBoxPresenter : AnswerBoxContract.Presenter {

    lateinit internal var view: AnswerBoxContract.View

    override fun setView(view: AnswerBoxContract.View) {
        this.view = view
    }

    override fun setAllCorrect() {
        view.showCorrectAtPositionOne()
        view.showCorrectAtPositionTwo()
        view.showCorrectAtPositionThree()
        view.showCorrectAtPositionFour()
    }

    override fun showAllIncorrect() {
        view.showIncorrectAtPositionOne()
        view.showIncorrectAtPositionTwo()
        view.showIncorrectAtPositionThree()
        view.showIncorrectAtPositionFour()
    }

    override fun setNumberCorrect(numberCorrectRightPosition: Int, numberCorrectWrongPosition: Int) {
        showAllIncorrect()
        val totalHintsToShow: Int = numberCorrectRightPosition + numberCorrectWrongPosition
        if (totalHintsToShow == 4) view.showRightNumberWrongPositionFour()
        if (totalHintsToShow == 3) view.showRightNumberWrongPositionThree()
        if (totalHintsToShow == 2) view.showRightNumberWrongPositionTwo()
        if (totalHintsToShow == 1) view.showRightNumberWrongPositionOne()

        if (numberCorrectRightPosition == 4) view.showCorrectAtPositionFour()
        if (numberCorrectRightPosition == 3) view.showCorrectAtPositionThree()
        if (numberCorrectRightPosition == 2) view.showCorrectAtPositionTwo()
        if (numberCorrectRightPosition == 1) view.showCorrectAtPositionOne()
    }

}
