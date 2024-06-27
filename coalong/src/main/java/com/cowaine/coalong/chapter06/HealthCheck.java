package com.cowaine.coalong.chapter06;

public class HealthCheck {
    void checkHealth(Member member) {
        HealthCondition currentHealthCondition;

        float hitPointRate = (float) member.hitPoint / member.maxHitPoint;
        if (hitPointRate == 0) {
            currentHealthCondition = HealthCondition.DEAD;
        } else if (hitPointRate < 0.3) {
            currentHealthCondition = HealthCondition.DANGER;
        } else if (hitPointRate < 0.5) {
            currentHealthCondition = HealthCondition.CAUTION;
        } else {
            currentHealthCondition = HealthCondition.FINE;
        }
    }
}
