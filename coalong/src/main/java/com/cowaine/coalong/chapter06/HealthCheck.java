package com.cowaine.coalong.chapter06;

public class HealthCheck {
    HealthCondition checkHealth(Member member) {
        float hitPointRate = (float) member.hitPoint / member.maxHitPoint;

        if (hitPointRate == 0) return HealthCondition.DEAD;
        if (hitPointRate < 0.3) return HealthCondition.DANGER;
        if (hitPointRate < 0.5) return HealthCondition.CAUTION;

        return HealthCondition.FINE;
    }
}
