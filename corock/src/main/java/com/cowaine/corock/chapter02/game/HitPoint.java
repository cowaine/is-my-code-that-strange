package com.cowaine.corock.chapter02.game;

import lombok.Getter;

/**
 * 히트 포인트(HP)를 나타내는 클래스다.
 */
@Getter
public class HitPoint {

    private static final int MIN = 0;
    private static final int MAX = 999;

    private final int value;

    /**
     * 대미지 생성자다.
     *
     * @param value 대미지
     */
    public HitPoint(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException(MIN + " 이상을 지정해 주세요.");
        }

        if (MAX < value) {
            throw new IllegalArgumentException(MAX + " 이하를 지정해 주세요.");
        }

        this.value = value;
    }

    /**
     * 대미지를 받는다.
     *
     * @param damageAmount 피해량
     * @return 피해량을 반영한 히트 포인트
     */
    public HitPoint damage(int damageAmount) {
        int damaged = value - damageAmount;
        int corrected = Math.max(damaged, MIN);

        return new HitPoint(corrected);
    }

    /**
     * 대미지를 회복한다.
     *
     * @param recoveryAmount 회복량
     * @return 회복량을 반영한 히트 포인트
     */
    public HitPoint recover(int recoveryAmount) {
        int recovered = value + recoveryAmount;
        int corrected = Math.min(MAX, recovered);

        return new HitPoint(corrected);
    }

}
