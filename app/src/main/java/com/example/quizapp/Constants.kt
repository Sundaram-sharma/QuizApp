package com.example.quizapp

object Constants {

    // creating constant variable to store the values

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        var que1 = Question(1,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_argentina, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que1) //adding the 'que1' to the question list


        var que2 = Question(2,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_brazil, "Russia","Brazil",
            "Pakistan","India", 2) //adding the data as defined in the data class Questions
        questionsList.add(que2) //adding the 'que2' to the question list


        var que3 = Question(3,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_germany, "Egypt","Russia",
            "Canada","Germany", 4) //adding the data as defined in the data class Questions
        questionsList.add(que3) //adding the 'que3' to the question list


        var que4 = Question(4,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_belgium, "Belgium","United Kingdom",
            "Sri Lanka","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que4) //adding the 'que4' to the question list


        var que5 = Question(5,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_australia, "Argentine","Australia",
            "Nepal","France", 2) //adding the data as defined in the data class Questions
        questionsList.add(que5) //adding the 'que5' to the question list


        var que6 = Question(6,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_fiji, "Fiji","India",
            "UAE","Mexico", 1) //adding the data as defined in the data class Questions
        questionsList.add(que6) //adding the 'que6' to the question list


        var que7 = Question(7,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_denmark, "Poland","Ukraine",
            "Afghanistan","Denmark", 4) //adding the data as defined in the data class Questions
        questionsList.add(que7) //adding the 'que7' to the question list

        var que8 = Question(8,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_india, "Nepal","India",
            "Pakistan","Mexico", 2) //adding the data as defined in the data class Questions
        questionsList.add(que8) //adding the 'que8' to the question list


        var que9 = Question(9,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_kuwait, "Mongolia","Pakistan",
            "United States","Kuwait", 4) //adding the data as defined in the data class Questions
        questionsList.add(que9) //adding the 'que9' to the question list


        var que10 = Question(10,"What country does this flag belong to? ",
            R.drawable.ic_flag_of_new_zealand, "New Zealand","India",
            "Taiwan","Chile", 1) //adding the data as defined in the data class Questions
        questionsList.add(que10) //adding the 'que10' to the question list

        return questionsList //as the functions wants to return

    }


}