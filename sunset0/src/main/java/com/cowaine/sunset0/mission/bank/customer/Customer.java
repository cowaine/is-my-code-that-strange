package com.cowaine.sunset0.mission.bank.customer;

import com.cowaine.sunset0.mission.bank.account.SavingAccount;

public class Customer {
    private final String name;
    private SavingAccount account;

    private Customer(String name, SavingAccount account) {
        this.name = name;
        this.account = account;
    }

    //정적 팩토리 메서드
    public static Customer createCustomerWithoutAccount(final String name) {
        return new Customer(name, null);
    }

    public String getName() {
        return name;
    }

    public void assignAccount(final SavingAccount account) {
        this.account = account;
    }
}
