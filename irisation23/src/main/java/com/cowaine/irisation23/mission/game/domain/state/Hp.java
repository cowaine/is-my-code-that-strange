package com.cowaine.irisation23.mission.game.domain.state;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Getter
public final class Hp {

    private final BigDecimal point;
}
