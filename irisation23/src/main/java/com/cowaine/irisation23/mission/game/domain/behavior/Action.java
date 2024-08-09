package com.cowaine.irisation23.mission.game.domain.behavior;

import com.cowaine.irisation23.mission.game.domain.subject.GameCharacter;

public interface Action<E extends GameCharacter, T extends GameCharacter> {

    void executeMonster(E executor, T target);

    void executeHero(T executor, E target);
}
