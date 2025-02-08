package com.cowaine.corock.mission.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    Account openAccount(Customer customer, Money initMoney) {
        return new Account(initMoney, 0.03f, customer);
    }

    public void payInterestOnAllAccounts() {
        for (Account account : accounts) {
            account.payInterest();
        }
    }
}
