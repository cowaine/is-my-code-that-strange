package com.cowaine.snoopingh.chap05;

import java.util.List;

/** 매직포인트 */
public class MagicPoint {
    // 매개변수가 너무 많아지는 문제를 피하려면, 개념적으로 의미 있는 클래스를 만들어야 함.
    // 매직포인트와 관련된 값들은 인스턴스 변수로 구성

    private static final int MIN = 0;

    // 현재 잔량
    private int currentAmount;

    // 원래 최댓값
    private int originalMaxAmount;

    //장비 착용에 따른 최댓값 증가량
    private List<Integer> maxIncrements;

    /**
     * @return 현재 매직포인트 잔량
     */
    int current() {
        return currentAmount;
    }

    /**
     * @return 매직포인트 최댓값
     */
    int max() {
        int amount = originalMaxAmount;
        for (int each : maxIncrements) {
            amount += each;
        }
        return amount;
    }

    /**
     * 매직포인트 회복하기
     * @param recoveryAmount 회복량
     */
    void recover(final int recoveryAmount) {
        currentAmount = Math.min(currentAmount + recoveryAmount, max());
    }

    /**
     * 매직포인트 소비하기
     * @param consumeAmount 소비량
     */
    void consume(final int consumeAmount) {
        currentAmount = Math.max(currentAmount - consumeAmount, MIN);
    }
}
