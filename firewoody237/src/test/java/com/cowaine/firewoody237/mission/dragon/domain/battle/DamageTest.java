package com.cowaine.firewoody237.mission.dragon.domain.battle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DamageTest {
    @Test
    @DisplayName("데미지는 최소값(0)보다 작을 수 없다.")
    void test1() {
        assertThatThrownBy(() -> new Damage(Damage.MINIMUM_DAMAGE - 1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
