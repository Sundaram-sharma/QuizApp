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


        var que11 = Question(11,"How many teeth does an adult human have? ",
            R.drawable.ic_teeth, "30","32",
            "34","28", 2) //adding the data as defined in the data class Questions
        questionsList.add(que11) //adding the 'que10' to the question list


        var que12 = Question(12,"What is the biggest state in America?",
            R.drawable.ic_usa, "Alaska","Arizona",
            "Arkansas","California", 1) //adding the data as defined in the data class Questions
        questionsList.add(que12) //adding the 'que10' to the question list


        var que13 = Question(13," Who wrote Snow White And The Seven Dwarfs? ",
            R.drawable.ic_snowwhite, "William Shakespeare","George Orwell",
            "Suzanne Weyn","John", 3) //adding the data as defined in the data class Questions
        questionsList.add(que13) //adding the 'que10' to the question list


        var que14 = Question(14,"In which sport would you use a shuttlecock? ",
            R.drawable.ic_shuttlecocj, "Hockey","Tennis",
            "Volleyball","Badminton", 4) //adding the data as defined in the data class Questions
        questionsList.add(que14) //adding the 'que10' to the question list


        var que15 = Question(15,"What is a group of lions called? ",
            R.drawable.ic_lion, "Pride","Streak",
            "Barrel","Coalitions", 1) //adding the data as defined in the data class Questions
        questionsList.add(que15) //adding the 'que10' to the question list


        var que16 = Question(16,"What planet is known as the red planet?",
            R.drawable.ic_mars, "Mars","Pluto",
            "Mercury","Jupiter", 1) //adding the data as defined in the data class Questions
        questionsList.add(que16) //adding the 'que10' to the question list


        var que17 = Question(17,"Which country is the origin of the cocktail Mojito?",
            R.drawable.ic_mojito, "China","Europe",
            "Cuba","Japan", 3) //adding the data as defined in the data class Questions
        questionsList.add(que17) //adding the 'que10' to the question list


        var que18 = Question(18,"Alberta is a province of which country?",
            R.drawable.ic_alberta, "Canada","Australia",
            "Europe","India", 1) //adding the data as defined in the data class Questions
        questionsList.add(que18) //adding the 'que10' to the question list


        var que19 = Question(19,"What is the longest river in the world?",
            R.drawable.ic_river, "Amazon river","Nile",
            "Mississippi River","Yangtze River", 2) //adding the data as defined in the data class Questions
        questionsList.add(que19) //adding the 'que10' to the question list


        var que20 = Question(20,"What colour is a giraffe's tongue?",
            R.drawable.ic_giraffe, "Bluish black with pink base","Pink with bluish base",
            "Yellow with red base","None of the above", 1) //adding the data as defined in the data class Questions
        questionsList.add(que20) //adding the 'que10' to the question list




        return questionsList //as the functions wants to return

    }


}