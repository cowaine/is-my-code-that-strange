package com.cowaine.coalong.chapter04;

public class Damage {
    int damage(Member member, Enemy enemy) {
        // 멤버의 힘과 무기 성능을 기본 공격력으로 활용합니다.
        final int basicAttackPower = member.power() + member.weaponAttack();
        // 멤버의 속도로 공격력을 보정합니다.
        final int finalAttackPower = (int)(basicAttackPower * (1f + member.speed() / 100f));
        // 공격력에서 적의 방어력을 뺀 값을 대미지로 사용합니다.
        final int reduction = (int)(enemy.defence / 2);
        // 대미지가 음수가 되지 않게 조정합니다.
        final int damage = Math.max(0, finalAttackPower - reduction);

        return damage;
    }
}
