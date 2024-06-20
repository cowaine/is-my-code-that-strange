package com.cowaine.corock.chapter04.game;

public class AttackPower {

    static final int MIN = 0;

    // final 을 붙이지 않았으므로 가변
    public int value;

    public AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

}
