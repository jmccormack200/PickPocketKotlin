package com.example.johnmccormick.pickpocketkotlin.widgets

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.ImageView
import com.example.johnmccormick.pickpocketkotlin.R

class AnswerCheckImageView constructor(context: Context, attrs: AttributeSet) : ImageView(context, attrs) {
    var colorWhite: Boolean = false

    init {
        val typedArray: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.AnswerCheckImageView, 0, 0)
        try {
            colorWhite = typedArray.getBoolean(R.styleable.AnswerCheckImageView_colorWhite, false)
        } finally {
            typedArray.recycle()
        }
        setimageWrong()
    }

    private fun setimageWrong() {
        background = context.getDrawable(if (colorWhite) {
            R.drawable.ic_check_box_outline_blank_white_24px
        } else {
            R.drawable.ic_check_box_outline_blank_black_24px
        })
    }

    private fun setImageCorrectValueWrongLocation(){
        background = context.getDrawable(if (colorWhite) {
            R.drawable.ic_indeterminate_check_box_white_24px
        } else {
            R.drawable.ic_indeterminate_check_box_black_24px
        })
    }

    private fun setImageCorrect(){
        background = context.getDrawable(if (colorWhite) {
            R.drawable.ic_check_box_white_24px
        } else {
            R.drawable.ic_check_box_black_24px
        })
    }
}