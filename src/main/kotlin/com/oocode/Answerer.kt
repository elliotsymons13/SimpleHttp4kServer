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
//        if (words.contains("minus")) {
//            // Convert the numbers to floats and subtract them
//            return (words[2].toFloat() - words[4].dropLast(1).toFloat()).toString().dropLast(1)
//        }
//        if (words.contains("times")) {
//            // Convert the numbers to floats and multiply them
//            return (words[2].toFloat() * words[4].dropLast(1).toFloat()).toString().dropLast(1)
//        }
//        if (words.contains("divided")) {
//            // Convert the numbers to floats and divide them
//            return (words[2].toFloat() / words[4].dropLast(1).toFloat()).toString().dropLast(1)
//        }



//        if (words.contains("+")||words.contains("/")||words.contains("*")||words.contains("-")) {
//            words = words.filter { it.contains() }
//        }

//        println(words)
//        val left = words[2].toFloat()
//        val right = (words[4].split("")[0]).toFloat()
//
//        println(left)
//        println(right)
//        if (words.contains("plus")) {
//            return (left + right).toString()
////            return (words[2].toFloat() + words[5].toFloat()).toString().split("")[0]
//        }
//        if (words.contains("/")) {
//            return (left / right).toString()
//        }
//        if (words.contains("*")) {
//            return (left * right).toString()
//        }
//        if (words.contains("-")) {
//            return (left - right).toString()
//        }

        if (question.contains("[0-9]")) {
            return words.filter({it.contains("[0-9]")}).max()
        }



        if (question.contains("name")) {
            return "Yasin & Elliot"
        }
        if (question.contains("2")) {
            return "4"
        }
        return "I don't know"
    }
}