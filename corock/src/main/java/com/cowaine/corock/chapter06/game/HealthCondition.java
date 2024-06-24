package com.cowaine.corock.chapter06.game;

public enum HealthCondition {

    FINE, CAUTION, DANGER, DEAD;

    public static HealthCondition from(Member member) {
        float hitPointRate = (float) member.getHitPoint() / member.getMaxHitPoint();

        HealthCondition currentHealthCondition;
        if (hitPointRate == 0) {
            currentHealthCondition = HealthCondition.DEAD;
        } else if (hitPointRate < 0.3) {
            currentHealthCondition = HealthCondition.DANGER;
        } else if (hitPointRate < 0.5) {
            currentHealthCondition = HealthCondition.CAUTION;
        } else {
            currentHealthCondition = HealthCondition.FINE;
        }

        return currentHealthCondition;
    }

}
