package com.cowaine.coalong.chapter05;

public class GiftPoint {
    private static final int MIN_POINT = 0;
    final int value;

    public GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("포인트를 0 이상 입력해야 합니다.");
        }
        this.value = point;
    }

    /**
     * 포인트 추가하기
     *
     * @param other 추가 포인트
     * @return 추가 후 남은 포인트
     */
    GiftPoint add(final GiftPoint other) {
        return new GiftPoint(this.value + other.value);
    }

    /**
     * @return 남은 포인트가 소비 포인트 이상이라면 true
     */
    boolean isEqual(final ConsumptionPoint point) {
        return point.value <= value;
    }

    /**
     * 포인트 소비하기
     * @param point 소비 포인트
     * @return 소비 후 남은 포인트
     */
    GiftPoint consume(final ConsumptionPoint point) {
        if (!isEqual(point)) {
            throw new IllegalArgumentException("포인트가 부족합니다.");
        }
        return new GiftPoint(this.value - point.value);
    }
}
