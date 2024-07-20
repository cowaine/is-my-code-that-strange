package com.cowaine.corock.chapter09.calculator;

public class MultipleCalculator {
    public static int multiply(FirstNumber firstNumber, SecondNumber secondNumber) {
        try {
            if (firstNumber == null) {
                firstNumber = new FirstNumber(0);
            }
        } catch (Exception e) {

        }

        return firstNumber.value * secondNumber.value;
    }
}
