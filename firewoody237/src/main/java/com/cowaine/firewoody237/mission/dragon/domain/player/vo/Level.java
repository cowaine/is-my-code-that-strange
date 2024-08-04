package com.cowaine.firewoody237.mission.dragon.domain.player.vo;

public class Level {
    public static final int MINIMUM_LEVEL = 1;

    private final Integer value;

    public Level(Integer value) {
        if (value < MINIMUM_LEVEL) {
            throw new IllegalArgumentException("최소레벨보다 레벨이 낮을 수 없습니다.");
        }

        this.value = value;
    }

    public Level levelUp() {
        return new Level(this.value + 1);
    }

    public int getLevel() {
        return this.value;
    }
}
