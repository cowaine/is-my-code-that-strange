package com.cowaine.irisation23.mission.bank.exception;

import com.cowaine.irisation23.mission.bank.domain.Client;

public class IllegalMoneyAmountException extends IllegalArgumentException{

    private static final String MESSAGE = " 고객님 계좌 생성에 실패했습니다.";
    public IllegalMoneyAmountException(final Client client) {
        super(client.getName() + makeMessage() + client.getDept().getValue() + ")\n" + "--------------------------");
    }

    private static String makeMessage() {
        return MESSAGE + System.lineSeparator() + "(Money is not negative: -";
    }
}
