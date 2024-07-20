package com.cowaine.coalong.mission.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts = new ArrayList<>();

    Account openAccount(Customer customer, Money initMoney) {
        Account openNewAccount = new Account(initMoney, customer);
        this.accounts.add(openNewAccount);
        return openNewAccount;
    }

    public void payInterestOnAllAccounts() {
        for (Account account : accounts) {
            account.payInterest();
        }
    }

}
