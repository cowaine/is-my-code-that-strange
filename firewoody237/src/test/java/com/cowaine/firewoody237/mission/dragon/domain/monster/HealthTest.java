package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HealthTest {
    @Test
    @DisplayName("레벨업을 하면, 최대 체력포인트가 증가하고 모든 체력을 회복한다.")
    void test1() {
        Health health = new Health(new MonsterHealthPoint(5), new MonsterHealthPoint(10));

        Health newHelath = health.levelUp();

        assertThat(newHelath.getCurrentMonsterHealthPoint().getHealthPoint())
                .isEqualTo(10 + Health.LEVEL_UP_GAIN_HEALTH_POINT);
        assertThat(newHelath.getMaximumMonsterHealthPoint().getHealthPoint())
                .isEqualTo(10 + Health.LEVEL_UP_GAIN_HEALTH_POINT);
    }
}
