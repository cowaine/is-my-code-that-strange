package com.cowaine.coalong.mission.game.domain;

import lombok.Getter;

@Getter
public class Solider implements AttackAble {
    private final String userId;
    private final Integer level;
    private final Integer hitPoint;
    private final Integer attackPoint;
    private final Integer currentHitPoint;

    public Solider(String userId, Integer level, Integer hitPoint, Integer attackPoint) {
        this.userId = userId;
        this.level = level;
        this.hitPoint = hitPoint;
        this.attackPoint = attackPoint;
        this.currentHitPoint = hitPoint;
    }

    Solider levelUp(Integer level, Integer increaseHitPoint, Integer increaseAttackPoint) {
        return new Solider(this.userId, level, this.hitPoint + increaseHitPoint, this.attackPoint + increaseAttackPoint);
    }

    @Override
    public void attack() {

    }
}
