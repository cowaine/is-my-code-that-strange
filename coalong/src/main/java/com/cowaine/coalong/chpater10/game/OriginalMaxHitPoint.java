package com.cowaine.coalong.chpater10.game;

import lombok.Getter;

@Getter
public class OriginalMaxHitPoint {

    private static final int MIN = 0;
    private static final int MAX = 999;

    private final int value;

    public OriginalMaxHitPoint(final int value) {
        if (value < MIN || MAX < value) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

}
