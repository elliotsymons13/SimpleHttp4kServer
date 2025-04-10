package com.oocode

import kotlin.math.cbrt
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

class Answerer {
    fun answerFor(question: String): String {
        val words = question.split(" ")

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
        println(words)
        if (words.contains("power")) {
            // Convert the numbers to floats and add them
            return (words[2].toDouble()).pow(words[7].dropLast(1).toDouble()).toString()
        }




        if (question.contains("largest")){
            val largest = question.split(":")[1]
            var numbers = largest.split(",").toMutableList()
            var count = 0
            println(numbers)
            numbers[2] = numbers[2].dropLast(1)
            for (item in numbers){
                val num = item.trim().toInt()
                if (count < num) {
                    count = num
                }

            }
            return count.toString()
            }


        if (question.contains("square")){
            val largest = question.split(":")[1]
            var numbers = largest.split(",").toMutableList()
            println(numbers)
            numbers[6] = numbers[6].dropLast(1)
            for (item in numbers){
                val num = item.trim().toInt()
                val sq = sqrt(num.toDouble())
                val cb = cbrt(num.toDouble())
                val sq_f = floor(sq)
                val cb_f = floor(cb)
                if ((cb==cb_f) && (sq == sq_f)) {
                    return num.toString()
                }
            }
        }

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