package com.cowaine.corock.chapter01.game;

import lombok.Getter;

@Getter
public class Member {

    private int hitPoint;
    private int magicPoint;

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
