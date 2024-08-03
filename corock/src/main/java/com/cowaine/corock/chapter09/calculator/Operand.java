package com.cowaine.corock.chapter09.calculator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Operand {

    private final int value;

    static Operand create(int value) {
        return new Operand(value);
    }

}
