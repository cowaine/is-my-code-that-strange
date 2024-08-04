package com.cowaine.firewoody237.first_mission.account.domain;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountVO;
import lombok.Getter;

public class BankAccount {
    @Getter
    private final long customerId;
    private final Currency currency;
    private Deposit deposit;
    private final YearlyInterestRate yearlyInterestRate;

    public BankAccount(
            long customerId, Currency currency, Deposit deposit
    ) {
        this.customerId = customerId;
        this.currency = currency;
        this.deposit = deposit;
        this.yearlyInterestRate = new YearlyInterestRate();
    }

    public BankAccount(
            long customerId, Currency currency, Deposit deposit, YearlyInterestRate yearlyInterestRate
    ) {
        this.customerId = customerId;
        this.currency = currency;
        this.deposit = deposit;
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public void depositInterest() {
        this.deposit = new Deposit(this.deposit.getAmount() + calculateInterest());
    }

    private int calculateInterest() {
        return (int) (this.yearlyInterestRate.getInterestRate() * this.deposit.getAmount());
    }

    public BankAccountVO toVO() {
        return new BankAccountVO(
                this.customerId,
                this.currency,
                this.deposit
                ,this.yearlyInterestRate
        );
    }

    public void deposit(int depositAmount) {
        this.deposit = this.deposit.add(new Deposit(depositAmount));
    }

    public boolean cannotWithdraw(int depositAmount) {
        return this.deposit.getAmount() < depositAmount;
    }

    public void withdraw(int depositAmount) {
        this.deposit = this.deposit.minus(new Deposit(depositAmount));
    }

    public boolean isCorrectCurrencyWith(BankAccount other) {
        return this.currency.equals(other.currency);
    }
}
