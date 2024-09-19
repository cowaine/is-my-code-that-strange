package com.cowaine.irisation23.mission.game.domain.subject;

import com.cowaine.irisation23.mission.game.domain.behavior.Action;
import com.cowaine.irisation23.mission.game.domain.behavior.ChangAbleState;
import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import java.math.BigDecimal;
import lombok.experimental.SuperBuilder;


@SuperBuilder(toBuilder = true)
public class Orc extends Monster implements ChangAbleState<Monster> {

    private Action<Orc, Hero> action;

    public static Orc init() {
        return new Orc("오크",
            Level.of(2),
            Hp.of(BigDecimal.valueOf(40)),
            AttackPower.of(BigDecimal.valueOf(6)));
    }

    private Orc(String id, Level level, Hp hp, AttackPower attackPower) {
        super(id, level, hp, attackPower);
    }

    public void behavior(final Action<Orc, Hero> action) {
        this.action = action;
    }

    public void performAction(final Hero target) {
        if (action != null) {
            action.executeMonster(this, target);
        } else {
            throw new IllegalArgumentException("행동 정의는 필수입니다.");
        }
    }

    @Override
    public Orc changeLevel(Level level) {
        return this.toBuilder()
                   .level(level)
                   .build();
    }

    @Override
    public Orc changeHp(Hp hp) {
        return this.toBuilder()
                   .hp(hp)
                   .build();
    }

    @Override
    public Orc changeAttackPower(AttackPower power) {
        return this.toBuilder()
                   .attackPower(power)
                   .build();
    }
}
