package com.cowaine.snoopingh.chap05;

public class GiftPoint {
    private static final int MIN_POINT = 0;

    final int value;

    GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("포인트를 0 이상 입력해야 합니다.");
        }

        value = point;
    }

    GiftPoint add(final GiftPoint other) {
        return new GiftPoint(value + other.value);
    }

    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    GiftPoint consume(final ConsumptionPoint point) {
        if (!isEnough(point)) {
            throw new IllegalArgumentException("포인트가 부족합니다.");
        }

        return new GiftPoint(value - point.value);
    }
}

class ConsumptionPoint {
    private static final int MIN_POINT = 0;

    final int value;

    ConsumptionPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("포인트를 0 이상 입력해야 합니다.");
        }

        value = point;
    }
}