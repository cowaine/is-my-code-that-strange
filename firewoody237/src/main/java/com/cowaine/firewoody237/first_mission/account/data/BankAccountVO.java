package com.cowaine.firewoody237.first_mission.account.data;

import com.cowaine.firewoody237.first_mission.account.domain.Currency;
import com.cowaine.firewoody237.first_mission.account.domain.Deposit;
import com.cowaine.firewoody237.first_mission.account.domain.YearlyInterestRate;
import lombok.Getter;

@Getter
public class BankAccountVO {
    private final long customerId;
    private final Currency currency;
    private final Deposit deposit;
    private final YearlyInterestRate yearlyInterestRate;

    public BankAccountVO(
            long customerId, Currency currency, Deposit deposit, YearlyInterestRate yearlyInterestRate
    ) {
        this.customerId = customerId;
        this.currency = currency;
        this.deposit = deposit;
        this.yearlyInterestRate = yearlyInterestRate;
    }
}
