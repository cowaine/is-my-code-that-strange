package com.cowaine.sunset0.chapter2;

//클래스를 활용하면 밀접한 관계를 갖고 있는 데이터와 로직을 묶을 수 있음.
public class HitPoint {
    private static final int MIN = 0;
    private static final int MAX = 999;
    final int value;

    HitPoint (final int value) {
        if (value < MIN) throw new IllegalArgumentException (MIN + "이상을 지정해 주세요.");
        if (MAX < value) throw new IllegalArgumentException (MAX + " 이하를 지정해 주세요.") ;
        this. value = value;
    }

    // 대미지를 받음,
    HitPoint damage(final int damageAmount) {
        final int damaged = value - damageAmount;
        final int corrected = damaged < MIN ? MIN: damaged;
        return new HitPoint (corrected);
    }
    // 회복
    HitPoint recover(final int recoveryAmount) {
        final int recovered = value + recoveryAmount;
        final int corrected = MAX < recovered ? MAX : recovered;
        return new HitPoint (corrected);
    }

}
