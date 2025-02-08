package com.cowaine.firewoody237.mission.dragon.domain.player;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.Id;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.Level;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerAttackPoint;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerHealthPoint;

public class Player {
    private final Id id;
    private Level level;
    private Health health;
    private Attack attack;

    public Player(Id id, Level level, PlayerHealthPoint maximumPlayerHealthPoint, PlayerAttackPoint minimumPlayerAttackPoint, PlayerAttackPoint maximumPlayerAttackPoint) {
        this.id = id;
        this.level = level;
        this.health = new Health(maximumPlayerHealthPoint, maximumPlayerHealthPoint);
        this.attack = new Attack(minimumPlayerAttackPoint, maximumPlayerAttackPoint);
    }

    public void levelUp() {
        level = level.levelUp();
        health = health.levelUp();
        attack = attack.levelUp();
    }

    public Damage attack() {
        return attack.attack();
    }

    public PlayerHealthPoint getDamage(Damage damage) {
        return health.getDamage(damage);
    }

    public PlayerHealthPoint getRemainHealthPoint() {
        return health.getRemainHealthPoint();
    }
}
