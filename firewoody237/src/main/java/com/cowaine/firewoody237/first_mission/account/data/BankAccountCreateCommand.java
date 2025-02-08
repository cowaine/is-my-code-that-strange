package com.cowaine.firewoody237.first_mission.account.data;

import lombok.Getter;

@Getter
public class BankAccountCreateCommand {
    private final long customerId;
    private final String currency;
    private final int depositAmount;
    private double yearlyInterestRate;

    public BankAccountCreateCommand(
            long customerId, String currency, int depositAmount, double yearlyInterestRate
    ) {
        this.customerId = customerId;
        this.currency = currency;
        this.depositAmount = depositAmount;
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public BankAccountCreateCommand(
            long customerId, String currency, int depositAmount
    ) {
        this.customerId = customerId;
        this.currency = currency;
        this.depositAmount = depositAmount;
    }
}
