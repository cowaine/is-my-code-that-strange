package com.cowaine.corock.chapter10.game;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
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
