package com.cowaine.firewoody237.fifth_week.bad_code.multiple_calculator;

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
