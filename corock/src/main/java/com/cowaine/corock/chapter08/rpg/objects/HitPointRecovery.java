package com.cowaine.corock.chapter08.rpg.objects;

/**
 * 히트포인트 회복
 */
public class HitPointRecovery {

    private static final int MAGIC_POWER_COEFFICIENT = 2;
    private static final int AFFECTION_COEFFICIENT = 5;

    /**
     * @param chanter          회복 마법 시전자
     * @param targetMemberId   회복 마법을 받는 멤버의 ID
     * @param positiveFeelings 멤버 간의 호감도
     */
    public HitPointRecovery(final Member chanter, final int targetMemberId, final PositiveFeelings positiveFeelings) {
        // 회복량 계산
        int positiveFeelingsAmount = positiveFeelings.value(chanter.getId(), targetMemberId);

        final int basicRecoverAmount = (int) (chanter.getMagicPower() * MAGIC_POWER_COEFFICIENT)
                + (int) (chanter.getAffection() * AFFECTION_COEFFICIENT * positiveFeelingsAmount);

        // (...)
    }

}
