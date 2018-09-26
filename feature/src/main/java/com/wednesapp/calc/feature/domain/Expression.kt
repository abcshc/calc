package com.wednesapp.calc.feature.domain

import com.wednesapp.calc.exception.InvalidInputExpressionException
import com.wednesapp.calc.exception.InvalidOpertatorException
import com.wednesapp.calc.util.NumberUtil

class Expression {
    private var firstNumber = Numbers()
    private var operatorValue: Char = ' '
    private var nextNumber = Numbers()
    private var hasOperatorValue: Boolean = false

    fun putChar(charValue: Char) {
        if (!NumberUtil.isNumber(charValue)) {
            if(!nextNumber.isEmpty()){
                throw InvalidInputExpressionException()
            }
            this.operatorValue = charValue
            hasOperatorValue = true
        } else {
            putNumber(charValue)
        }
    }

    fun calculate(): Int{
        if(operatorValue.equals('+'))
            return firstNumber.getNumber() + nextNumber.getNumber()
        throw InvalidOpertatorException()
    }

    private fun putNumber(numberValue: Char) {
        if (!hasOperatorValue) {
            this.firstNumber.putNumber(numberValue)
        } else {
            this.nextNumber.putNumber(numberValue)
        }
    }
}