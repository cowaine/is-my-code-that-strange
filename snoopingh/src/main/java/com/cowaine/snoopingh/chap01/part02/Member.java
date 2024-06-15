package com.cowaine.snoopingh.chap01.part02;

public class Member {
    public int hitPoint;
    public int magicPoint;
    public boolean actAble;

    public boolean canAct() {
        return actAble;
    }

    public void consumeMagicPoint(int costMagicPoint) {
        this.magicPoint -= costMagicPoint;
    }

    public void chant(Magic magic) {
        // 마법 부여
    }
}
