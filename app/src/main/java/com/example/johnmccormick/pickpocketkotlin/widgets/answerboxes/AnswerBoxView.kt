package com.example.johnmccormick.pickpocketkotlin.widgets.answerboxes

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import butterknife.bindView
import com.example.johnmccormick.pickpocketkotlin.R
import com.example.johnmccormick.pickpocketkotlin.widgets.AnswerCheckImageView

class AnswerBoxView constructor(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs),
        AnswerBoxContract.View {

    val answerCheckOne: AnswerCheckImageView by bindView(R.id.answer_digit_one)
    val answerCheckTwo: AnswerCheckImageView by bindView(R.id.answer_digit_two)
    val answercheckThree: AnswerCheckImageView by bindView(R.id.answer_digit_three)
    val answerCheckFour: AnswerCheckImageView by bindView(R.id.answer_digit_four)

    private var presenter: AnswerBoxContract.Presenter

    init {
        setView(context, attrs)

        presenter = AnswerBoxPresenter()
        presenter.setView(this)
    }

    private fun setView(context: Context, attrs: AttributeSet) {
        val typedArray: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.AnswerBoxView, 0, 0)
        var sizeSmall: Boolean

        try {
            sizeSmall = typedArray.getBoolean(R.styleable.AnswerBoxView_sizeSmall, false)
        } finally {
            typedArray.recycle()
        }
        View.inflate(context,
                (if (sizeSmall) R.layout.answer_box_layout_white_small
                else R.layout.answer_box_layout), this)
    }

    public fun setNumberCorrect(numberCorrectRightPosition: Int, numberCorrectWrongPosition: Int) {
        presenter.setNumberCorrect(numberCorrectRightPosition, numberCorrectWrongPosition)
    }

    override fun showCorrectAtPositionOne() {
        answerCheckOne.setImageCorrect()
    }

    override fun showCorrectAtPositionTwo() {
        answerCheckTwo.setImageCorrect()
    }

    override fun showCorrectAtPositionThree() {
        answercheckThree.setImageCorrect()
    }

    override fun showCorrectAtPositionFour() {
        answerCheckFour.setImageCorrect()
    }

    override fun showAllCorrect() {
        presenter.setAllCorrect()
    }

    override fun showRightNumberWrongPositionOne() {
        answerCheckOne.setImageCorrectValueWrongLocation()
    }

    override fun showRightNumberWrongPositionTwo() {
        answerCheckTwo.setImageCorrectValueWrongLocation()
    }

    override fun showRightNumberWrongPositionThree() {
        answercheckThree.setImageCorrectValueWrongLocation()
    }

    override fun showRightNumberWrongPositionFour() {
        answerCheckFour.setImageCorrectValueWrongLocation()
    }

    override fun showIncorrectAtPositionOne() {
        answerCheckOne.setimageWrong()
    }

    override fun showIncorrectAtPositionTwo() {
        answerCheckTwo.setimageWrong()
    }

    override fun showIncorrectAtPositionThree() {
        answercheckThree.setimageWrong()
    }

    override fun showIncorrectAtPositionFour() {
        answerCheckFour.setimageWrong()
    }
}