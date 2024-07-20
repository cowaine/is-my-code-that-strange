package com.cowaine.sunset0.mission.bank.customer;

import com.cowaine.sunset0.mission.bank.account.Account;

import java.util.ArrayList;
import java.util.List;

public class CustomerAccounts {
    private final List<Account> accounts;
    private static final int MAX_CUSTOMER_ACCOUNT_COUNT = 100;

    public CustomerAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    CustomerAccounts add(final Account account) {
        if ((accounts.stream().count() + 1) >= MAX_CUSTOMER_ACCOUNT_COUNT) {
            throw new InvalidAccountCountException(String.format("최대 계좌 개수는 %d개 입니다.", MAX_CUSTOMER_ACCOUNT_COUNT));
        }
        final List<Account> newAccounts = new ArrayList<>(this.accounts);
        newAccounts.add(account);
        return new CustomerAccounts(newAccounts);

    }
}
