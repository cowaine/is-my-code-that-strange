package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerAttackPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AttackTest {
    @Test
    @DisplayName("레벨업하면 최대 공격포인트가 증가한다.")
    void test1() {
            PlayerAttackPoint beforeMaximumPlayerAttackPoint = new PlayerAttackPoint(10);
        Attack attack = new Attack(
                beforeMaximumPlayerAttackPoint,
                beforeMaximumPlayerAttackPoint
        );

        Attack levelUpAttack = attack.levelUp();

        assertThat(
                levelUpAttack.getMaximumPlayerAttackPoint()
                        .equals(
                                beforeMaximumPlayerAttackPoint.gainAttackPoint(new PlayerAttackPoint(Attack.LEVEL_UP_GAIN_ATTACK_POINT))
                        )
        ).isTrue();
    }

    @Test
    @DisplayName("공격을 시도하면 최소 공격 포인트와 최대 공격 포인트 사이의 값을 반환한다.")
    void test2() {
        PlayerAttackPoint minAp = new PlayerAttackPoint(5);
        PlayerAttackPoint maxAp = new PlayerAttackPoint(20);
        Attack attack = new Attack(minAp, maxAp);

        for (int i=0; i<10; i++) {
            Damage damage = attack.attack();
            assertThat(damage.getDamage()).isBetween(minAp.getAttackPoint(), maxAp.getAttackPoint());
        }
    }
}
