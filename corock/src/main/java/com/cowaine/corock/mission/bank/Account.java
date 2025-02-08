package com.cowaine.corock.mission.bank;

public class Account {
    private Money balance;
    private float interestRate;
    private final String accountHolderName;

    public Account(Money initMoney, float interestRate, Customer customer) {
        this.balance = initMoney;
        this.interestRate = interestRate;
        this.accountHolderName = customer.getName();
    }

    public Money deposit(Money amount) {
        try {
            this.balance = this.balance.add(amount);
        } catch (DifferentCurrencyException e) {
            System.out.println(e.getMessage() + System.lineSeparator());
        }
        return this.balance;
    }

    public Money withdraw(Money amount) {
        try {
            this.balance = this.balance.subtract(amount);
        } catch (DifferentCurrencyException e) {
            System.out.println(e.getMessage() + System.lineSeparator());
        } catch (InvalidMoneyException e) {
            System.out.println("보유하신 금액보다 더 많은 금액을 인출할 수 없습니다." + System.lineSeparator() + e.getMessage());
        }
        return this.balance;
    }

    Money payInterest() {
        Money interest = calculateInterest();
        this.balance = this.balance.add(interest);
        return this.balance;
    }

    private Money calculateInterest() {
        return new Money((long) (this.balance.getAmount() * this.interestRate));
    }

    @Override
    public String toString() {
        return accountHolderName + " 님 입금한 돈: " + balance + ", 이자율: " + (interestRate * 100) + "%";
    }
}
