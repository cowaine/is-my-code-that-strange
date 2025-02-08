package com.cowaine.sunset0.chapter4.use_immutability_variability;

//4.25 가변으로 할 때는 반드시 올바른 상태로만 변경하도록 설계하기
public class HitPoint {
    private static final int MIN = 0;
    int amount;

    public HitPoint(int amount) throws IllegalAccessException {
        if (amount < MIN) {
            throw new IllegalAccessException();
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

class Member{
    final HitPoint hitPoint;
    final States states;

    public Member(final HitPoint hitPoint, final States states) {
        this.hitPoint = hitPoint;
        this.states = states;
    }

    //생략

    void damage(final int damageAmount) {
        hitPoint.damage(damageAmount);
        if (hitPoint.isZero()) {
            states.add(StateType.dead);
        }
    }
}
