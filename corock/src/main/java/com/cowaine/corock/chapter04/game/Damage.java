package com.cowaine.corock.chapter04.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Damage {

    private final Member member;
    private final Enemy enemy;

    public int damage() {
        // 멤버의 힘과 무기 성능을 기본 공격력으로 활용합니다.
        int tmp = member.power() + member.weaponAttack();

        // 멤버의 속도로 공격력을 보장합니다.
        tmp = (int) (tmp * (1f + member.speed() / 100f));

        // 공격력에서 적의 방어력을 뺀 값을 대미지로 사용합니다.
        tmp = tmp - (int) (enemy.getDefense() / 2);

        // 대미지가 음수가 되지 않게 조정합니다.
        tmp = Math.max(0, tmp);

        return tmp;
    }

}
