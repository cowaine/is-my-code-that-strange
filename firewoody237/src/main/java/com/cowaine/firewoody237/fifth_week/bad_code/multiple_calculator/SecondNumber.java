package com.cowaine.firewoody237.fifth_week.bad_code.multiple_calculator;

public class SecondNumber {
    public int value;

    public SecondNumber(Integer value) {
        if (value > 10) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    public int getValue() {
        if (this.value > 10) {
            this.value = 10;
        }

        return value;
    }
}
