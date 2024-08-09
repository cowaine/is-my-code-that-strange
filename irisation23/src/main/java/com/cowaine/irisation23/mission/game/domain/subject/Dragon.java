package com.cowaine.irisation23.mission.game.domain.subject;

import com.cowaine.irisation23.mission.game.domain.behavior.Action;
import com.cowaine.irisation23.mission.game.domain.behavior.ChangAbleState;
import com.cowaine.irisation23.mission.game.domain.state.AttackPower;
import com.cowaine.irisation23.mission.game.domain.state.Hp;
import com.cowaine.irisation23.mission.game.domain.state.Level;
import java.math.BigDecimal;
import java.util.Random;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
@Getter
public final class Dragon extends Monster implements ChangAbleState<Monster> {

    private Action<Dragon, Hero> action;
    private static final Random RANDOM = new Random();

    public static Dragon init() {
        return new Dragon("드래곤",
            Level.of(3),
            Hp.of(BigDecimal.valueOf(100)),
            AttackPower.of(BigDecimal.valueOf(10)));
    }

    private Dragon(String id, Level level, Hp hp, AttackPower attackPower) {
        super(id, level, hp, attackPower);
    }

    public void behavior(final Action<Dragon, Hero> action) {
        this.action = action;
    }

    public void performAction(final Hero target) {
        if (action == null) {
            throw new IllegalArgumentException("행동 정의는 필수입니다.");
        }

        if (RANDOM.nextDouble() < 0.1) { // 10% 확률로 브레스를 뿜습니다.
            target.changeHp(breathAttack(target));
            System.out.println("드래곤이 브레스를 뿜었습니다! " + target.getId() + "에게 15 고정 대미지를 입혔습니다.");
            return;
        }

        action.executeMonster(this, target);
    }

    private Hp breathAttack(Hero target) {
        return Hp.of(target.getHp().getPoint().subtract(BigDecimal.valueOf(15)));
    }

    @Override
    public Dragon changeLevel(Level level) {
        return this.toBuilder()
                   .level(level)
                   .build();
    }

    @Override
    public Dragon changeHp(Hp hp) {
        return this.toBuilder()
                   .hp(hp)
                   .build();
    }

    @Override
    public Dragon changeAttackPower(AttackPower power) {
        return this.toBuilder()
                   .attackPower(power)
                   .build();
    }
}
