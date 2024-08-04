package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterAttackPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AttackTest {
    @Test
    @DisplayName("레벨업하면 최대 공격포인트가 증가한다.")
    void test1() {
        MonsterAttackPoint beforeMaximumMonsterAttackPoint = new MonsterAttackPoint(10);
        Attack attack = new Attack(
                beforeMaximumMonsterAttackPoint,
                beforeMaximumMonsterAttackPoint
        );

        Attack levelUpAttack = attack.levelUp();

        assertThat(
                levelUpAttack.getMaximumMonsterAttackPoint()
                        .equals(
                                beforeMaximumMonsterAttackPoint.gainAttackPoint(new MonsterAttackPoint(Attack.LEVEL_UP_GAIN_ATTACK_POINT))
                        )
        ).isTrue();
    }

    @Test
    @DisplayName("공격을 시도하면 최소 공격 포인트와 최대 공격 포인트 사이의 값을 반환한다.")
    void test2() {
        MonsterAttackPoint minAp = new MonsterAttackPoint(5);
        MonsterAttackPoint maxAp = new MonsterAttackPoint(20);
        Attack attack = new Attack(minAp, maxAp);

        for (int i=0; i<10; i++) {
            Damage damage = attack.attack();
            assertThat(damage.getDamage()).isBetween(minAp.getAttackPoint(), maxAp.getAttackPoint());
        }
    }
}
