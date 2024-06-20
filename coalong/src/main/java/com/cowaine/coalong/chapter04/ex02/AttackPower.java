package com.cowaine.coalong.chapter04.ex02;

public class AttackPower {
    static final int MIN = 0;
    int value; // final 을 붙이지 않았으므로 가변

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }
}
