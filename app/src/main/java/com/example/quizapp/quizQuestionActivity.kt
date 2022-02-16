package com.example.quizapp

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlin.concurrent.fixedRateTimer

class quizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1 //Position of Question
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0 // will be used for selected option



    private var progressBar: ProgressBar? = null // declaring progressBar as null
    private var tvProgress: TextView? = null // declaring tvProgress as null
    private var tvQuestion: TextView? = null // declaring tvQuestion as null
    private var ivImage: ImageView? = null //  declaring ivImage as null
    private var btnSubmit: Button? = null // declaring the btnSubmit as null



    private var tvOptionOne: TextView? = null // declaring tvOptionOne as null
    private var tvOptionTwo: TextView? = null // declaring tvOptionTwo as null
    private var tvOptionThree: TextView? = null // declaring tvOptionThree as null
    private var tvOptionFour: TextView? = null //  declaring tvOptionFour as null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        //Initializing the variables
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_questions)
        ivImage = findViewById(R.id.iv_image)
        btnSubmit = findViewById(R.id.btn_submit)



        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        mQuestionList = Constants.getQuestions() // we can use 'mQuestionList' throughout the project

        setQuestion()
        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

    }

    private fun setQuestion() {
        // load the question lists
        //val questionsList = Constants.getQuestions()


        //Log.i("QuestionList size is ", "${questionsList.size}") // log the question size
//
        //for (i in questionsList) {
        //    Log.e("Questions", i.question)
        //}

        //var currentPosition = 1 // starting with 1 so that it displays "1/10: is question number
        var question: Question =
            mQuestionList!![mCurrentPosition - 1] // to display the question from index 0

        progressBar?.progress = mCurrentPosition // '?' means nullable
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        ivImage?.setImageResource(question.image)
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if(mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text = "FINISH"  // accessing the button property text and modify it

        }else{
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        //because 'tvOption...' is nullable, we need to add 'let' keyword
        tvOptionOne?.let {
            options.add(0,it) // adding to the option array list. adding '0' to 'it'
        }
        tvOptionTwo?.let {
            options.add(1,it) // adding to the option array list. adding '0' to 'it'
        }
        tvOptionThree?.let {
            options.add(2,it) // adding to the option array list. adding '0' to 'it'
        }
        tvOptionFour?.let {
            options.add(3,it) // adding to the option array list. adding '0' to 'it'
        }

        for (option in options){
            option.setTextColor(Color.parseColor("#545454"))// to change colours in all the options
            option.typeface = Typeface.DEFAULT //to make typeface default again, this will chnage only when it is selected
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_border_bg
            )
        }

    }

    //maing a funtion to display the options
    fun selectedOptionView(tv:TextView, selectedOptionNum: Int){

        defaultOptionsView() // calling the default view option



        mSelectedOptionPosition = selectedOptionNum // selectedOptionNum: Int....store the parameter value to the mSelectedOptionPosition

        Log.i("this is working","$mSelectedOptionPosition")

        tv.setTextColor(Color.parseColor("#2e2e2e")) //chnage selected option colour
        tv.setTypeface(tv.typeface, Typeface.BOLD)   //tv:TextView and change the seleted option to bold text

        tv.background = ContextCompat.getDrawable( //using the custom drawable to make the tv background
            this,R.drawable.selected_option_border_bg
        )
    }


    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.tv_option_one -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }

            }

            R.id.tv_option_two -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }

            }

            R.id.tv_option_three -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }

            }

            R.id.tv_option_four -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }

            }
            R.id.btn_submit ->{
                //to be implemented
            }

        }
    }

}