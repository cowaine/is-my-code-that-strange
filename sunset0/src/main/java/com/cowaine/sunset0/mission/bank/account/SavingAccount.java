package com.cowaine.sunset0.mission.bank.account;


import com.cowaine.sunset0.mission.bank.customer.Customer;

public class SavingAccount {
    private Money balance;
    private float interestRate;
    private final String accountHolderName;

    private SavingAccount(final Money initMoney, final float interestRate, final String customerName) {
        this.balance = initMoney;
        this.interestRate = interestRate;
        this.accountHolderName = customerName;

    }

    //정적 팩토리 메서드
    public static SavingAccount createAccount(final Money initMoney, final float interestRate, final Customer customer) {
        SavingAccount account = new SavingAccount(initMoney, interestRate, customer.getName());
        customer.assignAccount(account); //생성된 계좌 고객에게 할당
        return account;
    }

    public Money deposit(final Money amount) {
        try {
            this.balance = this.balance.add(amount);
        } catch (DifferentCurrencyException e) {
            System.out.println(e.getMessage() + System.lineSeparator());
        }
        return this.balance;
    }

    public Money withdraw(final Money amount) {
        try {
            this.balance = this.balance.subtract(amount);
        } catch (DifferentCurrencyException e) {
            System.out.println(e.getMessage() + System.lineSeparator());
        } catch (InvalidMoneyException e) {
            System.out.println("보유하신 금액보다 더 많은 금액을 인출할 수 없습니다." + System.lineSeparator() + e.getMessage());
        }
        return this.balance;
    }

    public Money payInterest() {
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
