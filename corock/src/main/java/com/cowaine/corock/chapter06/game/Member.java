package com.cowaine.corock.chapter06.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Member {

    private final int hitPoint;
    private final int maxHitPoint;
    private final int magicPoint;
    private final int technicalPoint;
    private final int level;

    public boolean canAct() {
        return false;
    }

    public void consumeMagicPoint(int costMagicPoint) {
        // (...)
    }

    public void chant(Magic magic) {
        // (...)
    }

}
