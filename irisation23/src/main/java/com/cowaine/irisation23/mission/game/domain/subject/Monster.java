package com.cowaine.irisation23.mission.game.domain.subject;

import com.cowaine.irisation23.mission.game.domain.behavior.ChangAbleState;
import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public abstract class Monster extends GameCharacter implements ChangAbleState<Monster> {

    protected Monster(String id, Level level, Hp hp, AttackPower attackPower) {
        super(id, level, hp, attackPower);
    }
}
