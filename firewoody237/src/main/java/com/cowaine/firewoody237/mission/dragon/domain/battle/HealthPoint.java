package com.cowaine.firewoody237.mission.dragon.domain.battle;

public interface HealthPoint {
    HealthPoint gainHealthPoint(int gainedHealthPoint);
    int getHealthPoint();
    HealthPoint loseHealthPoint(int looseHealthPoint);
}
