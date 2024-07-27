package com.cowaine.irisation23.mission.bank.domain;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Getter
public class Money {

    public static final Money EMPTY = null;
    private final BigDecimal value;
    private final Currency currency;
}
