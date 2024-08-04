package com.cowaine.firewoody237.mission.dragon.domain.monster;

public enum MonsterType {
    SLIME("슬라임"),
    ORC("오크"),
    DRAGON("드래곤")
    ;

    private final String name;

    MonsterType(String name) {
        this.name = name;
    }
}
