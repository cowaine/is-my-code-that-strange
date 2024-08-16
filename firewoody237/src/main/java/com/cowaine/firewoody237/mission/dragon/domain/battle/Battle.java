package com.cowaine.firewoody237.mission.dragon.domain.battle;

import com.cowaine.firewoody237.mission.dragon.domain.monster.Monster;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;
import com.cowaine.firewoody237.mission.dragon.domain.player.Player;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerHealthPoint;
import lombok.Getter;

import java.util.Objects;

@Getter
public class Battle {
    private final int turnDelay = 500;
    private final Player player;
    private final Monster monster;

    public Battle(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    PlayerHealthPoint attackPlayer(Monster from, Player to) {
        Damage monsterDamage = from.attack();
        return to.getDamage(monsterDamage);
    }

    MonsterHealthPoint attackMonster(Player from, Monster to) {
        Damage playerDamage = from.attack();
        return to.getDamage(playerDamage);
    }

    boolean isMonsterWin() {
        return Objects.equals(player.getRemainHealthPoint(), new PlayerHealthPoint(0));
    }

    boolean isPlayerWin() {
        return Objects.equals(monster.getRemainHealthPoint(), new MonsterHealthPoint(0));
    }

    PlayerHealthPoint getPlayerHealthPoint() {
        return player.getRemainHealthPoint();
    }

    MonsterHealthPoint getMonsterHealthPoint() {
        return monster.getRemainHealthPoint();
    }
}
