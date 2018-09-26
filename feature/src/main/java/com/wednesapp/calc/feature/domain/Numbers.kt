package com.wednesapp.calc.feature.domain

import com.wednesapp.calc.exception.NotNumberCharException
import com.wednesapp.calc.util.NumberUtil

class Numbers {
    private var numbers: String = ""
    fun putNumber(numberValue: Char) {
        if (!NumberUtil.isNumber(numberValue))
            throw NotNumberCharException()

        if (!(numberValue == '0' && numbers.isEmpty())) {
            numbers += numberValue
        }
    }

    fun getNumber(): Int {
        if(numbers.toIntOrNull() == null)
            throw NotNumberCharException()
        return numbers.toInt()
    }

    fun isEmpty(): Boolean {
        return numbers.isEmpty()
    }
}