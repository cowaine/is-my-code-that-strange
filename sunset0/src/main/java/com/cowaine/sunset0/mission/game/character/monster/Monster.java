package com.cowaine.sunset0.mission.game.character.monster;

import com.cowaine.sunset0.mission.game.character.Health;
import com.cowaine.sunset0.mission.game.character.hero.Hero;

public interface Monster {


    void attack(Hero hero);
    void takeDamage(Health damage);
    boolean isAlive();
}
