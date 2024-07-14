package com.cowaine.sunset0.chapter9;


//9.3 static final 상수로 숫자의 의미 표현하기
public class ReadingPoint {
    private static final int MIN = 0;
    private static final int TRIAL_READING_POINT = 60;
    private final int value;

    /**
     * 만화 구독 포인트 ReadingPoint 생성자
     * @param value 구독 포인트
     */
    public ReadingPoint(final int value) {
        if (value < MIN) {
            throw new RuntimeException();
        }
        this.value = value;
    }


    /**
     * 체험 구독할 수 있는지 확인
     * @return 체험 구독 가능한 경우 true
     */
    boolean canTryRead() {
        return TRIAL_READING_POINT <= value;
    }


    /**
     * 체험 구독
     * @return 체험 구독 후의 포인트
     */
    ReadingPoint consumeTrial() {
        return new ReadingPoint(value - TRIAL_READING_POINT);
    }

    /**
     * 구독 포인트 추가하기
     * @param readingPoint 추가 포인트
     * @return 추가 후 포인트
     */
    ReadingPoint add(final ReadingPoint readingPoint) {
        return new ReadingPoint(value + readingPoint.value);
    }
}
