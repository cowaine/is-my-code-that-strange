package com.cowaine.firewoody237.first_mission.account.domain;

import lombok.Getter;

import java.util.Arrays;

public enum Currency {
    KOREA_WON("WON", "₩"),
    US_DOLLAR("US_Dollar", "$"),
    ;

    @Getter
    private String value;
    private String symbol;

    Currency(String value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public static Currency of(String currency) {
        return findMatched(currency);
    }

    private static Currency findMatched(String currency) {
        return Arrays.stream(Currency.values())
                .filter(c -> c.value.equals(currency))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(currency + " is not supported currency."));
    }
}
