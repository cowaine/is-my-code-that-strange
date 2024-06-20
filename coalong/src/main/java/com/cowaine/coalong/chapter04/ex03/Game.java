package com.cowaine.coalong.chapter04.ex03;

public class Game {
}

class HitPoint {
    int amount;
}

class States {
}

class Member {
    final HitPoint hitPoint;
    final States states;

    public Member(HitPoint hitPoint, States states) {
        this.hitPoint = hitPoint;
        this.states = states;
    }

    void damage(int damageAmount) {
        hitPoint.amount -= damageAmount;
    }
}
