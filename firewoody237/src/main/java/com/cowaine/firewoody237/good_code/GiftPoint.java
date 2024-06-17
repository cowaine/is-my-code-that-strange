package com.cowaine.firewoody237.good_code;

public class GiftPoint {
    private static final int MIN_POINT = 0;
    public static final int STANDARD_MEMBERSHIP_POINT = 3000;
    public static final int PREMIUM_MEMBERSHIP_POINT = 10000;
    final int value;

    // 생성자를 private으로 클래스 내부에서만 인스턴스를 생성할 수 있게 한다.
    private GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException();
        }

        value = point;
    }

    // 응집도가 높아서, 변경에 대해 현재 클래스만 수정하면 된다.
    // 또한 다른 클래스에서 관련된 로직을 찾는 번거로움을 줄일 수 있다.
    static GiftPoint forStandardMembership() {
        return new GiftPoint(STANDARD_MEMBERSHIP_POINT);
    }

    static GiftPoint forPremiumMembership() {
        return new GiftPoint(PREMIUM_MEMBERSHIP_POINT);
    }
}
