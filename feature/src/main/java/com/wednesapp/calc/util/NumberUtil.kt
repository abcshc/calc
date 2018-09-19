package com.wednesapp.calc.util

class NumberUtil{
    companion object {
        fun isNumber(charValue: Char): Boolean {
            return charValue.toByte() in 48..57
        }
    }
}