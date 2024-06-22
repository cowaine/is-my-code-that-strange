package com.cowaine.sunset0.chapter5;

public class GiftPointFactory {

    private static final int MIN_POINT = 0;
    private static final int  STANDARD_MEMBERSHIP_POINT = 3000;
    private static final int  PREMIUM_MEMBERSHIP_POINT = 10000;
    private int value;

    //외부에서는 인스턴스를 생성할 수 없습니다.
    //클래스 내부에서만 생성할 수 있습니다.
    private GiftPointFactory(final int point) throws IllegalAccessException {
        if (point < MIN_POINT) {
            throw new IllegalAccessException("포인트를 0 이상 입력해야 합니다.");
        }
        this.value = point;
    }

    static GiftPointFactory forStandardMembership() throws IllegalAccessException {
        return new GiftPointFactory(STANDARD_MEMBERSHIP_POINT);
    }

    static GiftPointFactory forPremiumMembership() throws IllegalAccessException {
        return new GiftPointFactory(PREMIUM_MEMBERSHIP_POINT);
    }

    public static void main(String[] args) throws IllegalAccessException {
        GiftPointFactory standardMembership = GiftPointFactory.forStandardMembership();
        GiftPointFactory premiumMembership = GiftPointFactory.forPremiumMembership();
    }
}
