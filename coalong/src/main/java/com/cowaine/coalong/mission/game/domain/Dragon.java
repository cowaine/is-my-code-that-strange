package com.cowaine.coalong.mission.game.domain;

public class Dragon implements AttackAble {
    private final Integer level;
    private final Integer hitPoint;
    private final Integer attackPoint;

    public Dragon(Integer level, Integer hitPoint, Integer attackPoint) {
        this.level = level;
        this.hitPoint = hitPoint;
        this.attackPoint = attackPoint;
    }

    @Override
    public void attack() {

    }
}
