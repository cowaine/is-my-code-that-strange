package com.cowaine.corock.mission.bank;

public class Customer {
    private final String name;
    private Account account;

    public Customer(String name) {
        this(name, null);
    }

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }
}
