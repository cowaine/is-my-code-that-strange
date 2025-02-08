package com.cowaine.firewoody237.mission.dragon.domain.battle;

import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerHealthPoint;

public class BattleResult {
    private final PlayerHealthPoint playerHealthPoint;
    private final MonsterHealthPoint monsterHealthPoint;
    private final boolean PlayerDead;
    private final boolean MonsterDead;

    public BattleResult(PlayerHealthPoint playerHealthPoint, MonsterHealthPoint monsterHealthPoint, boolean playerDead, boolean monsterDead) {
        this.playerHealthPoint = playerHealthPoint;
        this.monsterHealthPoint = monsterHealthPoint;
        PlayerDead = playerDead;
        MonsterDead = monsterDead;
    }
}
