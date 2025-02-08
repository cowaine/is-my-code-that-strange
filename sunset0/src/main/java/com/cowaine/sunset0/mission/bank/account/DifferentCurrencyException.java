package com.cowaine.sunset0.mission.bank.account;

public class DifferentCurrencyException extends InvalidMoneyException {
    public DifferentCurrencyException(String message) {
        super(message);
    }
}
