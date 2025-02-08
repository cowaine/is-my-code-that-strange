package com.cowaine.snoopingh.chap05;

public class GiftPointFactory {
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBERSHIP_POINT = 3000;
    private static final int PREMIUM_MEMBERSHIP_POINT = 10000;
    final int value;

    private GiftPointFactory(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("포인트는 0 이상이어야 합니다.");
        }

        value = point;
    }

    static GiftPointFactory forStandardMembership() {
        return new GiftPointFactory(STANDARD_MEMBERSHIP_POINT);
    }

    static GiftPointFactory forPremiumMembership() {
        return new GiftPointFactory(PREMIUM_MEMBERSHIP_POINT);
    }
}
