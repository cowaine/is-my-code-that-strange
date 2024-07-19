package com.cowaine.corock.mission.bank;

public class InvalidMoneyException extends IllegalArgumentException {
    public InvalidMoneyException(String message) {
        super(message);
    }
}
