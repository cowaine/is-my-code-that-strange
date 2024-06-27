package com.cowaine.coalong.chapter06;

public class HealthCheck {
    HealthCondition checkHealth(Member member) {
        float hitPointRate = (float) member.hitPoint / member.maxHitPoint;

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
