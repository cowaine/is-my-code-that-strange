package com.cowaine.corock.chapter09.calculator;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
class Operand implements Calculable {

    private final int value;

    static Operand create(int value) {
        return new Operand(value);
    }

    @Override
    public Operand multiply(Operand other) {
        return new Operand(value * other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
