package com.cowaine.firewoody237.mission.dragon.domain.player.vo;

import com.cowaine.firewoody237.mission.dragon.domain.battle.HealthPoint;

public class PlayerHealthPoint implements HealthPoint {
    private final int value;

    public PlayerHealthPoint(int value) {
        this.value = value;
    }

    @Override
    public PlayerHealthPoint gainHealthPoint(int gainedHealthPoint) {
        return new PlayerHealthPoint(this.value + gainedHealthPoint);
    }

    @Override
    public int getHealthPoint() {
        return this.value;
    }

    @Override
    public PlayerHealthPoint loseHealthPoint(int looseHealthPoint) {
        return new PlayerHealthPoint(this.value - looseHealthPoint);
    }
}
