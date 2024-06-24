package com.cowaine.corock.chapter06.game;

public enum HealthCondition {

    FINE, CAUTION, DANGER, DEAD;

    public static HealthCondition from(Member member) {
        float hitPointRate = (float) member.getHitPoint() / member.getMaxHitPoint();

        if (hitPointRate == 0) {
            return HealthCondition.DEAD;
        } else if (hitPointRate < 0.3) {
            return HealthCondition.DANGER;
        } else if (hitPointRate < 0.5) {
            return HealthCondition.CAUTION;
        } else {
            return HealthCondition.FINE;
        }
    }

}
