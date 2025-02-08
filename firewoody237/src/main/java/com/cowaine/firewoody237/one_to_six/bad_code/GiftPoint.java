package com.cowaine.firewoody237.one_to_six.bad_code;

public class GiftPoint {
    private static final int MIN_POINT = 0;
    final int value;

    GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException();
        }

        value = point;
    }

    // 위 코드는 사용하는 곳에서 값을 지정하게 된다.
    // 로직이 분산되어 유지보수하기 어렵다.
    // 의도하지 않은 용도로 사용될 수 있다.
    // GiftPoint standardMembershipPoint = new GiftPoint(3000);
    // GiftPoint premiumMembershipPoint = new GiftPoint(10000);
}
