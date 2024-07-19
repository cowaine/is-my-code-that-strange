package com.cowaine.sunset0.mission.bank.bank;

import com.cowaine.sunset0.mission.bank.customer.Customer;
import com.cowaine.sunset0.mission.bank.account.Money;
import com.cowaine.sunset0.mission.bank.account.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<SavingAccount> accounts;
    private static float INTEREST_RATE = 0.03f;


    private Bank() {
        this.accounts = new ArrayList<>();
    }

    //정적 팩토리 메서드
    public static Bank createBank() {
        return new Bank();
    }


    public List<SavingAccount> getAccounts() {
        return accounts;
    }

    public SavingAccount openAccount(final Customer customer, final Money initMoney) {
        return SavingAccount.createAccount(initMoney, INTEREST_RATE, customer);
    }

    public void payInterestOnAllAccounts() {
        for (SavingAccount account : accounts) {
            account.payInterest();
        }
    }
}
