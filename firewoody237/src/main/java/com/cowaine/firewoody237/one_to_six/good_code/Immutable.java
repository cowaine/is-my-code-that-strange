package com.cowaine.firewoody237.one_to_six.good_code;

public class Immutable {
    final int value; // 불변으로 막는다.

    Immutable(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    // 매개변수를 불변하로하여 변경할 수 없게 한다.
    int damage(final int power, final int attack) {
        // final 키워드로 지역 변수를 재할당하기 어렵게 한다.
        final int basicAttackPower = power + attack;
        final int finalAttackPower = basicAttackPower / 100;

        return finalAttackPower;
    }

    // value를 변경하는 것이 아닌 인스턴스를 새로 생성하여 리턴한다.
    Immutable getImmutable() {
        final int lastValue = this.value + 10;
        return new Immutable(lastValue);
    }
}
