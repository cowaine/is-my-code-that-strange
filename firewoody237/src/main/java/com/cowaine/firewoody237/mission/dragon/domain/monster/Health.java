package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;
import lombok.Getter;

@Getter
public class Health {
    public static final int LEVEL_UP_GAIN_HEALTH_POINT = 50;

    private final MonsterHealthPoint currentMonsterHealthPoint;
    private final MonsterHealthPoint maximumMonsterHealthPoint;

    public Health(MonsterHealthPoint currentMonsterHealthPoint, MonsterHealthPoint maximumMonsterHealthPoint) {
        this.currentMonsterHealthPoint = currentMonsterHealthPoint;
        this.maximumMonsterHealthPoint = maximumMonsterHealthPoint;
    }

    public Health levelUp() {
        MonsterHealthPoint levelUpMonsterHealthPoint = this.maximumMonsterHealthPoint.gainHealthPoint(LEVEL_UP_GAIN_HEALTH_POINT);
        return new Health(levelUpMonsterHealthPoint, levelUpMonsterHealthPoint);
    }

    public MonsterHealthPoint getDamage(Damage damage) {
        return currentMonsterHealthPoint.loseHealthPoint(damage.getDamage());
    }

    public MonsterHealthPoint getRemainHealthPoint() {
        return currentMonsterHealthPoint;
    }
}
