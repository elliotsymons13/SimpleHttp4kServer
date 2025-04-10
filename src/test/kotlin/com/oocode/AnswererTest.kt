package com.oocode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class AnswererTest {
    @Test
    fun `can answer name`() {
        val contents = Answerer().answerFor("What is your name?")
        assertThat(contents, equalTo("Yasin & Elliot"))
    }
    @Disabled
    @Test
    fun `can pretend to do calculations`() {
        val contents = Answerer().answerFor("What is 2 + 2?")
        assertThat(contents, equalTo("4.0"))
    }

    @Disabled
    @Test
    fun `can calc max`() {
        val contents = Answerer().answerFor("Which of the following numbers is the largest: 36, 76, 88?")
        assertThat(contents, equalTo("88"))
    }

    @Test
    fun `does not know the answer in other cases`() {
        val contents = Answerer().answerFor("What is the answer to life, the universe, and everything?")
        assertThat(contents, equalTo("I don't know"))
    }
}
