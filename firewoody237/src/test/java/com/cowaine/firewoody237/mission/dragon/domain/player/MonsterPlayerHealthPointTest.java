package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerHealthPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonsterPlayerHealthPointTest {

    @Test
    @DisplayName("추가 체력 포인트를 얻으면, 현재 체력 포인트에서 추가분 만큼의 체력 포인트를 더한 값을 반환한다.")
    void test1() {
        PlayerHealthPoint playerHealthPoint = new PlayerHealthPoint(10);

        PlayerHealthPoint newPlayerHealthPoint = playerHealthPoint.gainHealthPoint(7);

        assertThat(newPlayerHealthPoint.getHealthPoint())
                .isEqualTo(17);
    }
}
