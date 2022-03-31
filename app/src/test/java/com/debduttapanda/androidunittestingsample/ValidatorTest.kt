package com.debduttapanda.androidunittestingsample

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest{

    @Test
    fun whenInputIsValid(){
        val amount = 100
        val description = "Description for 100"
        val result = Validator.validateInput(amount, description)
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun whenInputIsInvalid(){
        val amount = 0
        val description = "0"
        val result = Validator.validateInput(amount, description)
        assertThat(result).isEqualTo(false)
    }
}