package com.cowaine.irisation23.mission.game.domain.subject;

import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder(toBuilder = true)
@RequiredArgsConstructor
@Getter
public class GameCharacter {

    final String id;
    final Level level;
    final Hp hp;
    final AttackPower attackPower;
}
