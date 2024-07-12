package com.cowaine.coalong.chapter09;

public class Level {
    private static final int MIN = 1;
    private static final int MAX = 99;
    final int value;

    public Level(final int value) {
        if (value < MIN || value > MAX) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    // 초기 레벨 리턴
    static Level initialize() {
        return new Level(MIN);
    }

    // 레벨 업
    Level increase(int value) {
        if (value < MAX) return new Level(value + 1);
        return this;
    }
}
