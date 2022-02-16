package com.example.quizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        var que1 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_argentina, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que1) //adding the 'que1' to the question list


        var que2 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_brazil, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que2) //adding the 'que2' to the question list


        var que3 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_germany, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que3) //adding the 'que3' to the question list


        var que4 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_belgium, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que4) //adding the 'que4' to the question list


        var que5 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_australia, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que5) //adding the 'que5' to the question list


        var que6 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_fiji, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que6) //adding the 'que6' to the question list


        var que7 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_denmark, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que7) //adding the 'que7' to the question list

        var que8 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_india, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que8) //adding the 'que8' to the question list


        var que9 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_kuwait, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que9) //adding the 'que9' to the question list


        var que10 = Question(1,"Whar country does this flag belong to? ",
            R.drawable.ic_flag_of_new_zealand, "Argentine","India",
            "Pakistan","Canada", 1) //adding the data as defined in the data class Questions
        questionsList.add(que10) //adding the 'que10' to the question list

        return questionsList //as the functions wants to return

    }


}