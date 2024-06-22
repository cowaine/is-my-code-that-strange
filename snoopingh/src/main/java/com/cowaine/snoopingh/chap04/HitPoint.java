package com.cowaine.snoopingh.chap04;

class HitPoint { // 뮤테이터 : 상태를 변화시키는 메서드
    private static final int MIN = 0;
    int amount;

    HitPoint(final int amount) {
        if (amount < MIN) {
            throw new IllegalArgumentException();
        }

        this.amount = amount;
    }

    void damage(final int damageAmount) {
        final int nextAmount = amount - damageAmount;
        amount = Math.max(MIN, nextAmount);
    }

    boolean isZero() {
        return amount == MIN;
    }
}

class States {
    void add(StateType type) {
    }
}

enum StateType {
    dead
}


class Member {
    final HitPoint hitPoint;
    final States states;

    Member(HitPoint hitPoint, States states) {
        this.hitPoint = hitPoint;
        this.states = states;
    }

    void damage(final int damageAmount) {
        hitPoint.damage(damageAmount);
        if (hitPoint.isZero()) {
            states.add(StateType.dead);
        }
    }
}