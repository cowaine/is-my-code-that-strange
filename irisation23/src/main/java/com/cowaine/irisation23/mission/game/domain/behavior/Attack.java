package com.cowaine.irisation23.mission.game.domain.behavior;

import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.subject.GameCharacter;
import com.cowaine.irisation23.mission.game.domain.subject.Hero;
import com.cowaine.irisation23.mission.game.domain.subject.Monster;

public final class Attack implements Action<Monster, Hero> {

    @Override
    public void executeMonster(Monster executor, Hero target) {
        target.changeHp(attack(executor, target));
    }

    @Override
    public void executeHero(Hero executor, Monster target) {
        target.changeHp(attack(executor, target));
    }

    private <A extends GameCharacter, B extends GameCharacter> Hp attack(A executor, B target) {
        return Hp.of(target.getHp().getPoint().subtract(executor.getAttackPower().getPoint()));
    }
}
