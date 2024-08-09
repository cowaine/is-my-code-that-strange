package com.cowaine.irisation23.mission.game.domain.subject;

import com.cowaine.irisation23.mission.game.domain.behavior.Action;
import com.cowaine.irisation23.mission.game.domain.behavior.ChangAbleState;
import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import java.math.BigDecimal;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class Slime extends Monster implements ChangAbleState<Monster> {

    private Action<Slime, Hero> action;

    public static Slime init() {
        return new Slime("슬라임",
            Level.of(2),
            Hp.of(BigDecimal.valueOf(30)),
            AttackPower.of(BigDecimal.valueOf(4)));
    }

    private Slime(String id, Level level, Hp hp, AttackPower attackPower) {
        super(id, level, hp, attackPower);
    }

    public void behavior(final Action<Slime, Hero> action) {
        this.action = action;
    }

    public void performAction(final Hero target) {
        if (action != null) {
            action.executeMonster(this, target);
        }

        throw new IllegalArgumentException("행동 정의는 필수입니다.");
    }

    @Override
    public Slime changeLevel(Level level) {
        return this.toBuilder()
                   .level(level)
                   .build();
    }

    @Override
    public Slime changeHp(Hp hp) {
        return this.toBuilder()
                   .hp(hp)
                   .build();
    }

    @Override
    public Slime changeAttackPower(AttackPower power) {
        return this.toBuilder()
                   .attackPower(power)
                   .build();
    }
}
