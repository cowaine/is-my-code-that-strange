package com.cowaine.corock.chapter09.webtoon;

/**
 * 만화 구독 포인트다.
 */
public class ReadingPoint {

    /**
     * 포인트 최솟값
     */
    private static final int MIN = 0;

    /**
     * 체험 구독 소비 포인트
     */
    private static final int TRIAL_READING_POINT = 60;

    /**
     * 구독 포인트 값
     */
    final int value;

    /**
     * 만화 구독 포인트 {@link ReadingPoint} 생성자다.
     *
     * @param value 구독 포인트
     */
    public ReadingPoint(final int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    /**
     * 체험 구독할 수 있는지 확인한다.
     *
     * @return 체험 구독 가능한 경우 true
     */
    boolean canTryRead() {
        return TRIAL_READING_POINT <= value;
    }

    /**
     * 체험 구독한다.
     *
     * @return 체험 구독 후의 포인트
     */
    ReadingPoint consumeTrial() {
        return new ReadingPoint(value - TRIAL_READING_POINT);
    }

    /**
     * 구독 포인트를 추가한다.
     *
     * @param point 추가 포인트
     * @return 추가 후 포인트
     */
    ReadingPoint add(final ReadingPoint point) {
        return new ReadingPoint(value + point.value);
    }

}
