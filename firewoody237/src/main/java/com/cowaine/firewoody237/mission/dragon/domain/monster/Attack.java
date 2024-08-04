package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterAttackPoint;
import lombok.Getter;

import java.util.Random;

public class Attack {
    public static final int LEVEL_UP_GAIN_ATTACK_POINT = 10;

    private final MonsterAttackPoint minimumMonsterAttackPoint;
    @Getter
    private final MonsterAttackPoint maximumMonsterAttackPoint;

    public Attack(MonsterAttackPoint minimumMonsterAttackPoint, MonsterAttackPoint maximumMonsterAttackPoint) {
        this.minimumMonsterAttackPoint = minimumMonsterAttackPoint;
        this.maximumMonsterAttackPoint = maximumMonsterAttackPoint;
    }

    public Attack levelUp() {
        MonsterAttackPoint afterLevelUpHealthPoint = maximumMonsterAttackPoint.gainAttackPoint(new MonsterAttackPoint(LEVEL_UP_GAIN_ATTACK_POINT));
        return new Attack(afterLevelUpHealthPoint, afterLevelUpHealthPoint);
    }

    public Damage attack() {
        return new Damage(
                getRandomRange(minimumMonsterAttackPoint.getAttackPoint(), maximumMonsterAttackPoint.getAttackPoint())
        );
    }

    private int getRandomRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
