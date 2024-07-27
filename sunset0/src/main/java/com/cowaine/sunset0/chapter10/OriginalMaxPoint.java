package com.cowaine.sunset0.chapter10;

//10.5 캐릭터의 원래 최재 히트 포인트를 나타내는 클래스
public class OriginalMaxPoint {
    private static final int MIN = 10;
    private static final int MAX = 999;
    final int value;

    public OriginalMaxPoint(int value) throws IllegalAccessException {

        if (value < MIN || MAX < value) {
            throw new IllegalAccessException();
        }
        this.value = value;
    }
}
