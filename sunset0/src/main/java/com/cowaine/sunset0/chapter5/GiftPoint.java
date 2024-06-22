package com.cowaine.sunset0.chapter5;

//5.4 기프트 포인트를 나타내는 클래스
public class GiftPoint {

    private static final int MIN_POINT = 0;
    private static final int  STANDARD_MEMBERSHIP_POINT = 3000;
    private static final int  PREMIUM_MEMBERSHIP_POINT = 10000;
    private int value;

    public GiftPoint(final int point) throws IllegalAccessException {
        if (point < MIN_POINT) {
           throw new IllegalAccessException("포인트를 0 이상 입력해야 합니다.");
        }
        this.value = point;
    }

    GiftPoint add(final GiftPoint other) throws IllegalAccessException {
        return new GiftPoint(value + other.value);
    }

    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    GiftPoint consume(final ConsumptionPoint point) throws IllegalAccessException {
        if (!isEnough(point)) {
            throw new IllegalAccessException("포인트가 부족합니다.");
        }
        return new GiftPoint(value - point.value);
    }


}
