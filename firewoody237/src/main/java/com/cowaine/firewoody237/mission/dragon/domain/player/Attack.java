package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerAttackPoint;
import lombok.Getter;

import java.util.Random;

public class Attack {
    public static final int LEVEL_UP_GAIN_ATTACK_POINT = 10;

    private final PlayerAttackPoint minimumPlayerAttackPoint;
    @Getter
    private final PlayerAttackPoint maximumPlayerAttackPoint;

    public Attack(PlayerAttackPoint minimumPlayerAttackPoint, PlayerAttackPoint maximumPlayerAttackPoint) {
        this.minimumPlayerAttackPoint = minimumPlayerAttackPoint;
        this.maximumPlayerAttackPoint = maximumPlayerAttackPoint;
    }

    public Attack levelUp() {
        PlayerAttackPoint afterLevelUpHealthPoint = maximumPlayerAttackPoint.gainAttackPoint(new PlayerAttackPoint(LEVEL_UP_GAIN_ATTACK_POINT));
        return new Attack(afterLevelUpHealthPoint, afterLevelUpHealthPoint);
    }

    public Damage attack() {
        return new Damage(
                getRandomRange(minimumPlayerAttackPoint.getAttackPoint(), maximumPlayerAttackPoint.getAttackPoint())
        );
    }

    private int getRandomRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
