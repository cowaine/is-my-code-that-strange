package com.cowaine.irisation23.mission.bank.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Client implements SameAbleCurrency<Client> {

    private final String clientSerialNumber;
    private final String name;
    private final Money money;
    private final Dept dept;

    public static Client of(final String clientSerialNumber, final String name, final Money money, final Dept dept) {
        return new Client(clientSerialNumber, name, money, dept);
    }

    @Override
    public boolean sameCurrency(Client client) {
        return this.getMoney().getCurrency().equals(client.getMoney().getCurrency());
    }
}
