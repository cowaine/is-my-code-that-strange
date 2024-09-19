package com.cowaine.irisation23.mission.game.domain.subject;

import com.cowaine.irisation23.mission.game.domain.behavior.Action;
import com.cowaine.irisation23.mission.game.domain.behavior.ChangAbleState;
import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder(toBuilder = true)
@Getter
public final class Hero extends GameCharacter implements ChangAbleState<Hero> {

    private Action<Monster, Hero> action;

    public static Hero init(String id) {
        return new Hero(id,
            Level.of(1),
            Hp.of(BigDecimal.valueOf(100)),
            AttackPower.of(BigDecimal.valueOf(10)));
    }

    private Hero(String id, Level level, Hp hp, AttackPower attackPower) {
        super(id, level, hp, attackPower);
    }

    public Hero behavior(final Action<Monster, Hero> action) {
        return this.toBuilder()
                   .action(action)
                   .build();
    }

    public void performAction(final Monster target) {
        if (action != null) {
            action.executeHero(this, target);
        }

        throw new IllegalArgumentException("행동 정의는 필수입니다.");
    }

    @Override
    public Hero changeLevel(final Level level) {
        if (level.getPoint() > this.level.getPoint()) {
            return levelUp(level);
        }

        return this.toBuilder()
                   .level(level)
                   .build();
    }

    private Hero levelUp(final Level level) {
        return this.toBuilder()
                   .level(Level.of(level.getPoint()))
                   .hp(Hp.of(this.hp.getPoint().add(BigDecimal.valueOf(50))))
                   .attackPower(AttackPower.of(this.attackPower.getPoint().add(BigDecimal.valueOf(10))))
                   .build();
    }

    @Override
    public Hero changeHp(final Hp hp) {
        return this.toBuilder()
                   .hp(hp)
                   .build();
    }

    @Override
    public Hero changeAttackPower(final AttackPower power) {
        return this.toBuilder()
                   .attackPower(power)
                   .build();
    }
}
