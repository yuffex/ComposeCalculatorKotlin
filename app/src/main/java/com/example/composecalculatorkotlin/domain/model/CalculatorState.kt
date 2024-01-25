package com.example.composecalculatorkotlin.domain.model

import com.example.composecalculatorkotlin.ui.buttons.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
