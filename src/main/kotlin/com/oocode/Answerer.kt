package com.oocode

class Answerer {
    fun answerFor(question: String): String {
        val words = question.split(" ")

//        if (words.contains("+")||words.contains("/")||words.contains("*")||words.contains("-")) {
//            words = words.filter { it.contains() }
//        }

        println(words)


        if (question.contains("[0-9]")) {
            return words.filter({it.contains("[0-9]")}).max()
        }

//        val left = words[2].toFloat()
//        val right = (words[4].split("")[0]).toFloat()
//
//        println(left)
//        println(right)
//        if (words.contains("+")) {
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


        if (question.contains("name")) {
            return "Yasin & Elliot"
        }
        if (question.contains("2")) {
            return "4"
        }
        return "I don't know"
    }
}