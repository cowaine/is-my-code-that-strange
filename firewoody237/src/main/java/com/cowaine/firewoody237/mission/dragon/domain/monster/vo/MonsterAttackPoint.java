package com.cowaine.firewoody237.mission.dragon.domain.monster.vo;

import com.cowaine.firewoody237.mission.dragon.domain.battle.AttackPoint;

import java.util.Objects;

public class MonsterAttackPoint implements AttackPoint {
    public static final int MINIMUM_ATTACK_POINT = 0;

    private final int value;

    public MonsterAttackPoint(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("공격 포인트가 최소값보다 낮습니다.");
        }

        this.value = value;
    }

    public MonsterAttackPoint gainAttackPoint(MonsterAttackPoint gainedMonsterAttackPoint) {
        return new MonsterAttackPoint(value + gainedMonsterAttackPoint.value);
    }

    @Override
    public int getAttackPoint() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonsterAttackPoint that = (MonsterAttackPoint) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
