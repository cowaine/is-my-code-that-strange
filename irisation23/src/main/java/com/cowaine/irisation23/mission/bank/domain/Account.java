package com.cowaine.irisation23.mission.bank.domain;

import com.cowaine.irisation23.mission.bank.exception.IllegalCurrencyException;
import com.cowaine.irisation23.mission.bank.exception.IllegalMoneyAmountException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Account {

    private final String name;
    private final Client client;
    private final double interestRate;

    public static Account of(String name, Client client) {
        if (!isDeptEmpty(client)) {
            throw new IllegalMoneyAmountException(client);
        }

        if (!isCurrencyWon(client)) {
            throw new IllegalCurrencyException(client);
        }

        return new Account(name, client, 3.0);
    }

    private static boolean isDeptEmpty(Client client) {
        return client.getDept() == Dept.EMPTY;
    }

    private static boolean isCurrencyWon(Client client) {
        return client.getMoney().getCurrency().equals(Currency.WON);
    }
}
