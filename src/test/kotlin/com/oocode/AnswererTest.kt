package com.oocode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.lang.Math.pow
import kotlin.math.pow

class AnswererTest {
    @Test
    fun `can answer name`() {
        val contents = Answerer().answerFor("What is your name?")
        assertThat(contents, equalTo("Yasin & Elliot"))
    }
    @Test
    fun `can pretend to do calculations`() {
        val contents = Answerer().answerFor("What is 2 plus 2?")
        assertThat(contents, equalTo("4"))
    }

    @Test
    fun `can pretend to do multiplication`() {
        val contents = Answerer().answerFor("What is 2 multiplied by 5?")
        assertThat(contents, equalTo("10"))
    }


    @Test
    fun `can pretend to do power`() {
        val contents = Answerer().answerFor("What is 30 to the power of 86?")
        assertThat(contents, equalTo(30.0.pow(86.0).toString()))
    }

    @Test
    fun `can calc max`() {
        val contents = Answerer().answerFor("Which of the following numbers is the largest: 36, 76, 88?")
        assertThat(contents, equalTo("88"))
    }
    @Disabled
    @Test
    fun `can calc prime`() {
        val contents = Answerer().answerFor("Which of the following numbers are primes: 31, 33, 23, 77, 43?")
        assertThat(contents, equalTo("31"))
    }

    @Test
    fun `can calc square and cube`() {
        val contents = Answerer().answerFor("Which of the following numbers is both a square and a cube: 2742, 64, 676, 3405, 2098, 1728, 4052?")
        assertThat(contents, equalTo("64"))
    }


    @Test
    fun `does not know the answer in other cases`() {
        val contents = Answerer().answerFor("What is the answer to life, the universe, and everything?")
        assertThat(contents, equalTo("I don't know"))
    }
}
