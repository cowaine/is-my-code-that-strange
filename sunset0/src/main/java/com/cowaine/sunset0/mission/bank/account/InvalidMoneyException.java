package com.cowaine.sunset0.mission.bank.account;

public class InvalidMoneyException extends IllegalArgumentException {
    public InvalidMoneyException(String message) {
        super(message);
    }
}
