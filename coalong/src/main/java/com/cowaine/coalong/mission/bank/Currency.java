package com.cowaine.coalong.mission.bank;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Currency {
    WON("KRW", "₩"),
    DOLLAR("USD", "$"),
    YEN("JPY", "¥");

    private final String code;
    private final String sign;
}
