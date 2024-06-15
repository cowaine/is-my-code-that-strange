package com.cowaine.first.two.domain;

public class Member {
    public int hitPoint;
    public int magicPoint;

    public boolean canAct() {
        return false;
    }

    public void consumeMagicPoint(int costMagicPoint) {
        // Member 인스턴스의 매직 포인트 삭감
    }

    public void chant(Magic magic) {
    }
}
