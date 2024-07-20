package com.cowaine.irisation23.mission.bank.exception;

import com.cowaine.irisation23.mission.bank.domain.Client;

public class IllegalCurrencyException extends IllegalArgumentException {

    private static final String MESSAGE = " 고객님 계좌 생성에 실패했습니다." + System.lineSeparator();
    public IllegalCurrencyException(final Client client) {
        super(client.getName() + makeMessage(client));
    }

    private static String makeMessage(final Client client) {
        return MESSAGE + "(" + client.getMoney().getCurrency().toString() + " is not supported currency.)\n "
            + "--------------------------";
    }
}
