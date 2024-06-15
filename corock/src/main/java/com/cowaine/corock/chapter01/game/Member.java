package com.cowaine.corock.chapter01.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Member {

    private final int hitPoint;
    private final int magicPoint;

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
