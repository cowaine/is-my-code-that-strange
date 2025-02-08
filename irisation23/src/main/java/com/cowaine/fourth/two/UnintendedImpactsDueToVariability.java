package com.cowaine.fourth.two;

// 4.2 가변으로 인해 발생하는 의도하지 않은 영향
public class UnintendedImpactsDueToVariability {
}

// 4.2.1 사례 1: 가변 인스턴스 재사용하기
class AttackPower {
    static final int MIN = 0;
    final int value; // final을 붙이지 않았으므로 가변

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    // 4.2.2 함수로 가변 인스턴스 조작하기
    AttackPower reinforce(final AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    AttackPower disable() { // 무력화 하기
        return new AttackPower(MIN);
    }
}

// 4.2.5 불변으로 만들어서 예기치 못한 동작 막기
class Weapon {
    final AttackPower attackPower;

    public Weapon(final AttackPower attackPower) {
        this.attackPower = attackPower;
    }

    Weapon reinforce(final AttackPower increment) {
        final AttackPower reinforced = attackPower.reinforce(increment);
        return new Weapon(reinforced);
    }

}