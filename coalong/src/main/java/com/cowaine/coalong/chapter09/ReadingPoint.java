package com.cowaine.coalong.chapter09;

/**
 * 만화 구독 포인트
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
     * 만화 구독 포인트 ReadingPoint 의 생성자
     *
     * @param value 구독 포인트
     */
    public ReadingPoint(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    /**
     * 체험 구독
     *
     * @return 체험 구독 후의 포인트
     */
    boolean canTryRead() {
        return TRIAL_READING_POINT <= value;
    }

    /**
     * 구독 포인트 추가하기
     *
     * @param point 추가 포인트
     * @return 추가 후 포인트
     */
    ReadingPoint add(final ReadingPoint point) {
        return new ReadingPoint(value + point.value);
    }
}
