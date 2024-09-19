package com.cowaine.irisation23.mission.game.domain.state;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Getter
public class AttackPower {

    private final BigDecimal point;
}
