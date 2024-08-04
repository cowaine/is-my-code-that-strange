package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerAttackPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MonsterPlayerAttackPointTest {

    @Test
    @DisplayName("공격 포인트는 최소 포인트 이하로 설정할 수 없다.")
    void test1() {
        assertThatThrownBy(() -> new PlayerAttackPoint(PlayerAttackPoint.MINIMUM_ATTACK_POINT - 1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공격 포인트가 최소값보다 낮습니다.");
    }

    @Test
    @DisplayName("공격 포인트를 얻으면, 현재 공격 포인트에서 추가분 만큼의 공격 포인트를 더한 값을 반환한다.")
    void test2() {
        PlayerAttackPoint beforePlayerAttackPoint = new PlayerAttackPoint(10);
        PlayerAttackPoint gainedPlayerAttackPoint = new PlayerAttackPoint(5);

        PlayerAttackPoint afterPlayerAttackPoint = beforePlayerAttackPoint.gainAttackPoint(gainedPlayerAttackPoint);

        assertThat(afterPlayerAttackPoint.equals(new PlayerAttackPoint(15)))
                .isTrue();
    }
}
