package com.cowaine.sunset0.mission.bank.bank;

import com.cowaine.sunset0.mission.bank.account.Account;
import com.cowaine.sunset0.mission.bank.customer.Customer;
import com.cowaine.sunset0.mission.bank.account.Money;
import com.cowaine.sunset0.mission.bank.account.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    private Bank() {
        this.accounts = new ArrayList<>();
    }

    //정적 팩토리 메서드
    public static Bank createBank() {
        return new Bank();
    }


    public List<Account> getAccounts() {
        return accounts;
    }

    public Account openAccount(final Customer customer, final Money initMoney) {
        return SavingAccount.createAccount(initMoney, customer);
    }

    public void payInterestOnAllAccounts() {
        for (Account account : accounts) {
            account.payInterest();
        }
    }
}
