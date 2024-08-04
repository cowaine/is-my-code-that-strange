package com.cowaine.firewoody237.mission.dragon.domain.monster.vo;

import com.cowaine.firewoody237.mission.dragon.domain.battle.HealthPoint;

public class MonsterHealthPoint implements HealthPoint {
    private final int value;

    public MonsterHealthPoint(int value) {
        this.value = value;
    }

    @Override
    public MonsterHealthPoint gainHealthPoint(int gainedHealthPoint) {
        return new MonsterHealthPoint(this.value + gainedHealthPoint);
    }

    @Override
    public MonsterHealthPoint loseHealthPoint(int looseHealthPoint) {
        return new MonsterHealthPoint(this.value - looseHealthPoint);
    }

    @Override
    public int getHealthPoint() {
        return this.value;
    }
}
