package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerHealthPoint;
import lombok.Getter;

@Getter
public class Health {
    public static final int LEVEL_UP_GAIN_HEALTH_POINT = 50;

    private final PlayerHealthPoint currentPlayerHealthPoint;
    private final PlayerHealthPoint maximumPlayerHealthPoint;

    public Health(PlayerHealthPoint currentPlayerHealthPoint, PlayerHealthPoint maximumPlayerHealthPoint) {
        this.currentPlayerHealthPoint = currentPlayerHealthPoint;
        this.maximumPlayerHealthPoint = maximumPlayerHealthPoint;
    }

    public Health levelUp() {
        PlayerHealthPoint levelUpPlayerHealthPoint = this.maximumPlayerHealthPoint.gainHealthPoint(LEVEL_UP_GAIN_HEALTH_POINT);
        return new Health(levelUpPlayerHealthPoint, levelUpPlayerHealthPoint);
    }

    public PlayerHealthPoint getDamage(Damage damage) {
        return currentPlayerHealthPoint.loseHealthPoint(damage.getDamage());
    }

    public PlayerHealthPoint getRemainHealthPoint() {
        return currentPlayerHealthPoint;
    }
}
