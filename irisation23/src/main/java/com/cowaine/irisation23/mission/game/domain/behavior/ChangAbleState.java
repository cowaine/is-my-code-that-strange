package com.cowaine.irisation23.mission.game.domain.behavior;

import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import com.cowaine.irisation23.mission.game.domain.subject.GameCharacter;

public interface ChangAbleState<T extends GameCharacter> {

    T changeLevel(final Level level);

    T changeHp(final Hp hp);

    T changeAttackPower(final AttackPower power);
}
