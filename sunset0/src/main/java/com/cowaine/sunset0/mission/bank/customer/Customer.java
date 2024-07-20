package com.cowaine.sunset0.mission.bank.customer;


import com.cowaine.sunset0.mission.bank.account.Account;


public class Customer {
    private final String name;
    private CustomerAccounts customerAccounts;

    private Customer(String name) {
        this.name = name;
        this.customerAccounts = null;
    }

    //정적 팩토리 메서드
    public static Customer createCustomerWithoutAccount(final String name) {
        return new Customer(name);
    }

    public String getName() {
        return name;
    }

    public void addAccount(final Account account) {
        CustomerAccounts newCustomerAccounts = this.customerAccounts.add(account);
        this.customerAccounts = newCustomerAccounts;
    }
}
