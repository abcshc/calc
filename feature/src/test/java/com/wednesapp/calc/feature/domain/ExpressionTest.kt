package com.wednesapp.calc.feature.domain

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ExpressionTest{
    private lateinit var expression : Expression
    @Before
    fun init(){
        expression = Expression()
    }

    @Test
    fun 생성_후_덧셈_숫자입력(){
        expression.putChar('3')
        expression.putChar('+')
        expression.putChar('5')
        assertEquals(8, expression.calculate())
    }

    @Test
    fun
}