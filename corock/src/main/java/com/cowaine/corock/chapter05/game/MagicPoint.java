package com.cowaine.corock.chapter05.game;

import java.util.List;

/**
 * 매직 포인트 클래스다.
 */
public class MagicPoint {

    // 현재 잔량
    private int currentAmount;

    // 원래 최댓값
    private int originalMaxAmount;

    // 장비 착용에 따른 최댓값 증가량
    private List<Integer> maxIncrements;

    // (...)

    /**
     * @return 현재 매직 포인트 잔량
     */
    int current() {
        return currentAmount;
    }

    /**
     * @return 매직 포인트 최댓값
     */
    int max() {
        int amount = originalMaxAmount;
        for (Integer each : maxIncrements) {
            amount += each;
        }
        return amount;
    }

    /**
     * 매직 포인트를 회복한다.
     *
     * @param recoveryAmount 회복량
     * @return 회복 후의 매직 포인트 잔량
     */
    void recover(final int recoveryAmount) {
        currentAmount = Math.min(currentAmount + recoveryAmount, this.max());
    }

    /**
     * 매직 포인트를 소비한다.
     *
     * @param consumeAmount 소비량
     */
    void consume(final int consumeAmount) {
        // (...)
    }

}
