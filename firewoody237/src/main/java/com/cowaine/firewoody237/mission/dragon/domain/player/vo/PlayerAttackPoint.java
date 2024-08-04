package com.cowaine.firewoody237.mission.dragon.domain.player.vo;

import com.cowaine.firewoody237.mission.dragon.domain.battle.AttackPoint;

import java.util.Objects;

public class PlayerAttackPoint implements AttackPoint {
    public static final int MINIMUM_ATTACK_POINT = 0;

    private final int value;

    public PlayerAttackPoint(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("공격 포인트가 최소값보다 낮습니다.");
        }

        this.value = value;
    }

    public PlayerAttackPoint gainAttackPoint(PlayerAttackPoint gainedPlayerAttackPoint) {
        return new PlayerAttackPoint(value + gainedPlayerAttackPoint.value);
    }

    @Override
    public int getAttackPoint() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerAttackPoint that = (PlayerAttackPoint) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
