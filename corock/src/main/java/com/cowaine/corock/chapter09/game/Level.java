package com.cowaine.corock.chapter09.game;

import lombok.Getter;

@Getter
public class Level {

    private static final int MIN = 1;
    private static final int MAX = 99;

    final int value;

    private Level(final int value) {
        if (value < MIN || MAX < value) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    // 초기 레벨 반환
    public static Level initialize() {
        return new Level(MIN);
    }

    // 레벨 업
    Level increase() {
        if (value == MAX) {
            return new Level(value + 1);
        }
        return this;
    }

}
