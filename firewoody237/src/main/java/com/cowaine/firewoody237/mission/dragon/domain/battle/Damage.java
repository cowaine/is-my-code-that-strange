package com.cowaine.firewoody237.mission.dragon.domain.battle;

import java.util.Objects;

public class Damage {
    public static final int MINIMUM_DAMAGE = 0;

    private final int value;

    public Damage(int value) {
        if (value < MINIMUM_DAMAGE) {
            throw new IllegalArgumentException("데미지는 최소값보다 적을 수 없습니다.");
        }

        this.value = value;
    }

    public Damage(AttackPoint attackPoint) {
        this.value = attackPoint.getAttackPoint();
    }

    public int getDamage() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Damage damage = (Damage) o;
        return value == damage.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
