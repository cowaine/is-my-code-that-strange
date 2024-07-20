package com.cowaine.corock.chapter09.calculator;

public class FirstNumber {
    public int value;

    public FirstNumber(Integer value) {
        if (value > 9999) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    public int getValue() {
        if (this.value > 9999) {
            this.value = 9999;
        }

        return value;
    }
}
