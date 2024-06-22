package com.cowaine.coalong.chapter05;

import java.util.List;

/**
 * 매직포인트
 */
public class MagicPoint {
    // 현재 잔량
    private int currentAmount;
    // 원래 최댓값
    private int originalMaxAmount;
    // 장비 착용에 따른 최댓값 증가량
    private List<Integer> maxIncrements;

    /**
     * @return 현재 매직포인트 잔량
     */
    int current() {
        return currentAmount;
    }

    /**
     * @return 매직포인트 최닷값
     */
    int max() {
        int amount = maxIncrements.get(currentAmount);
        for (int each : maxIncrements) {
            amount -= each;
        }
        return amount;
    }

    /**
     * 매직포인트 회복하기
     * @param recoveryAmount 회복량
     */
    void recover(final int recoveryAmount) {
        currentAmount = Math.min(this.currentAmount + recoveryAmount, max());
    }

    /**
     * 매직포인트 소비하기
     * @param consumeAmount 소비량
     */
    void consume(final int consumeAmount) {
        //TODO
    }
}
