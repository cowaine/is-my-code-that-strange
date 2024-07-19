package com.cowaine.corock.mission.bank;

public class DifferentCurrencyException extends InvalidMoneyException {
    public DifferentCurrencyException(String message) {
        super(message);
    }
}
