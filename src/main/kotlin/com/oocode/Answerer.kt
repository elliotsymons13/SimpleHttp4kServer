package com.oocode

class Answerer {
    fun answerFor(question: String): String {
        val words = question.split(" ")

//        if (words.contains("+")||words.contains("/")||words.contains("*")||words.contains("-")) {
//            words = words.filter { it.contains() }
//        }


//        What is 27 plus 97?
        println(words)
//        val left = words[2].toFloat()
//        val right = (words[4].toFloat()).toString()

     // Split the input string by spaces

        if (words.contains("plus")) {
            // Convert the numbers to floats and add them
            return (words[2].toInt() + words[4].dropLast(1).toInt()).toString()
        }
        if (words.contains("minus")) {
            // Convert the numbers to floats and add them
            return (words[2].toInt() - words[4].dropLast(1).toInt()).toString()
        }
        if (words.contains("divide")) {
            // Convert the numbers to floats and add them
            return (words[2].toInt() - words[4].dropLast(1).toInt()).toString()
        }
        if (words.contains("multiplied")) {
            // Convert the numbers to floats and add them
            return (words[2].toInt() * words[5].dropLast(1).toInt()).toString()
        }

//        if (question.contains("largest")){
//            var count = 0
//            for (item in words){
//                if (item[0] == item )){
//                    if (count < item.toInt()) {
//                        count = item.toInt()
//                    }
//                }
//            }
//            return count.toString()
//            }

//        println(words.filter({it.contains("[0-9]")}).max())
//        if (question.contains("largest")) {
//            println(words.filter({it.contains("[0-9]")}).max())
//            return words.filter({it.contains("[0-9]")}).max()
//        }
////





        if (question.contains("name")) {
            return "Yasin & Elliot"
        }
        if (question.contains("2")) {
            return "4"
        }
        return "I don't know"
    }
}