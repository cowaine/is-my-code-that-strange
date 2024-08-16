package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.player.vo.Level;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LevelTest {

    @Test
    @DisplayName("레벨은 최소값 이하로 설정할 수 없다.")
    void test1() {
        assertThatThrownBy(() -> new Level(Level.MINIMUM_LEVEL - 1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("레벨업을 하면 1추가된 상태로 레벨을 반환한다.")
    void test2() {
        Level level = new Level(1);

        Level newLevel = level.levelUp();

        assertThat(newLevel.getLevel())
                .isEqualTo(2);
    }
}
