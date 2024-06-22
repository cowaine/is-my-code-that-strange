package com.cowaine.coalong.chapter05;

import java.util.List;

public class MagicPoint {

    /**
     * 매직포인트 회복하기
     *
     * @param currentMagicPoint       현재 매직포인트 잔량
     * @param originalMagicPoint      원래 매직포인트 최댓값
     * @param maxMagicPointIncrements 장비로 증가하는 매직포인트 최댓값 증가량
     * @param recoveryMagicPoint      회복량
     * @return 회복 후의 매직포인트 잔량
     */
    int recoverMagicPoint(int currentMagicPoint,
                          int originalMagicPoint,
                          List<Integer> maxMagicPointIncrements,
                          int recoveryMagicPoint) {

        int currentMaxMagicPoint = originalMagicPoint;
        for (int each : maxMagicPointIncrements) {
            currentMaxMagicPoint += each;
        }

        return Math.min(currentMagicPoint + recoveryMagicPoint, currentMagicPoint);
    }
}
