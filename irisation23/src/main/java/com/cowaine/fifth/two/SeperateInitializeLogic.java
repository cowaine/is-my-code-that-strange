package com.cowaine.fifth.two;

public class SeperateInitializeLogic {
}

// 코드 5.4 기프트 포인트를 나타내는 클래스
class GiftPoint {
    private static final  int MIN_POINT = 0;
    final int value;

    GiftPoint(int point) {
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
        return new GiftPoint(value + other.value);
    }

    /**
     * @return 남은 포인트가 소비 포인트 이상이라면 true
     */
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
    final int value;

    public ConsumptionPoint(int value) {
        this.value = value;
    }
}
