package com.cowaine.firewoody237.mission.dragon.domain.battle;

import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;
import com.cowaine.firewoody237.mission.dragon.domain.player.vo.PlayerHealthPoint;

public class BattleService {

    public BattleResult takeATurn(Battle battle, Round round) {
        MonsterHealthPoint playerMonsterHealthPoint = battle.attackMonster(battle.getPlayer(), battle.getMonster());
        if (playerMonsterHealthPoint.getHealthPoint() == 0) {
            // 배틀 종료
            return new BattleResult(
                    battle.getPlayerHealthPoint(),
                    battle.getMonsterHealthPoint(),
                    true,
                    false
            );
        }

        PlayerHealthPoint monsterPlayerHealthPoint = battle.attackPlayer(battle.getMonster(), battle.getPlayer());
        if (monsterPlayerHealthPoint.getHealthPoint() == 0) {
            // 배틀 종료
            return new BattleResult(
                    battle.getPlayerHealthPoint(),
                    battle.getMonsterHealthPoint(),
                    false,
                    true
            );
        }

        return new BattleResult(
                battle.getPlayerHealthPoint(),
                battle.getMonsterHealthPoint(),
                false,
                false
        );
    }
}
