package com.cowaine.firewoody237.mission.dragon.domain.battle;

import com.cowaine.firewoody237.mission.dragon.domain.monster.MonsterType;

public enum Round {
    FIRST(1, MonsterType.SLIME),
    SECOND(2, MonsterType.ORC),
    THIRD(3, MonsterType.DRAGON)
    ;

    private final int round;
    private final MonsterType monsterType;


    Round(int round, MonsterType monsterType) {
        this.round = round;
        this.monsterType = monsterType;
    }
}
