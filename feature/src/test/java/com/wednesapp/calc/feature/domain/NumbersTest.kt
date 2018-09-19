package com.wednesapp.calc.feature.domain

import com.wednesapp.calc.exception.NotNumberCharException
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class NumbersTest{
    private lateinit var numbers : Numbers
    @Before
    fun init(){
        numbers = Numbers()
    }

    @Test(expected=NotNumberCharException::class)
    fun 숫자_아닌_값_예외(){
        numbers.putNumber('d')
    }

    @Test
    fun 숫자_입력(){
        numbers.putNumber('1')
        numbers.putNumber('2')
        assertEquals(12, numbers.getNumber())
    }

    @Test
    fun 숫자_0_우선_입력(){
        numbers.putNumber('0')
        numbers.putNumber('3')
        numbers.putNumber('0')
        assertEquals(30, numbers.getNumber())
    }

    @Test(expected=NotNumberCharException::class)
    fun 빈_값_숫자_얻기_예외(){
        print(numbers.getNumber())
    }
}