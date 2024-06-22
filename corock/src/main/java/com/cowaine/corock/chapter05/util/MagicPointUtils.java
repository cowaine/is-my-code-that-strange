package com.cowaine.corock.chapter05.util;

import java.util.List;

public class MagicPointUtils {

    /**
     * 매직 포인트를 회복한다.
     *
     * @param currentMagicPoint       현재 매직 포인트 잔량
     * @param originalMaxMagicPoint   원래 매직 포인트 최댓값
     * @param maxMagicPointIncrements 장비로 증가하는 매직 포인트 최댓값 증가량
     * @param recoveryAmount          회복량
     * @return 회복 후의 매직 포인트 잔량
     */
    int recoverMagicPoint(int currentMagicPoint, int originalMaxMagicPoint, List<Integer> maxMagicPointIncrements,
                          int recoveryAmount) {

        int currentMaxMagicPoint = originalMaxMagicPoint;
        for (Integer each : maxMagicPointIncrements) {
            currentMaxMagicPoint += each;
        }

        return Math.min(currentMagicPoint + recoveryAmount, currentMaxMagicPoint);
    }

}
