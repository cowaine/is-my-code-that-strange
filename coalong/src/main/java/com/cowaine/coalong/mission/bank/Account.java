package com.cowaine.coalong.mission.bank;


public class Account {
    private Money balance;
    private final Customer customer;
    private static final Currency currency = Currency.WON;
    private static final float interestRate = 0.3F;

    public Account(Money balance, Customer customer) {
        if (balance.getAmount() < 0) {
            throw new IllegalArgumentException("Negative balance");
        }
        if (!balance.getCurrency().equals(currency)) {
            throw new IllegalArgumentException("Invalid currency");
        }
        this.balance = balance;
        this.customer = customer;
    }

    // 입금
    Money deposit(Money amount) {
        // 제약 조건
        this.balance = this.balance.add(amount);
        return this.balance;
    }

    // 출금
    Money withdrawal(Money amount) {
        // 제약 조건
        this.balance = this.balance.subtract(amount);
        return this.balance;
    }

    // 이자 지급
    Money payInterest() {
        Money interest = calculateInterest();
        this.balance = this.balance.add(interest);
        return this.balance;
    }

    private Money calculateInterest() {
        return new Money((long) (this.balance.getAmount() * interestRate), this.balance.getCurrency());
    }
}


