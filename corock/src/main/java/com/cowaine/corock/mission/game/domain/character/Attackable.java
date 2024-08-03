package com.cowaine.corock.mission.game.domain.character;

/**
 * An Attackable is the interface class that has the attack method.
 */
public interface Attackable {
    void attack(GameCharacter other);
}
