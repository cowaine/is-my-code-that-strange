package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonsterPlayerHealthPointTest {
    @Test
    @DisplayName("추가 체력 포인트를 얻으면, 현재 체력 포인트에서 추가분 만큼의 체력 포인트를 더한 값을 반환한다.")
    void test1() {
        MonsterHealthPoint monsterHealthPoint = new MonsterHealthPoint(10);

        MonsterHealthPoint newMonsterHealthPoint = monsterHealthPoint.gainHealthPoint(7);

        assertThat(newMonsterHealthPoint.getHealthPoint())
                .isEqualTo(17);
    }
}
