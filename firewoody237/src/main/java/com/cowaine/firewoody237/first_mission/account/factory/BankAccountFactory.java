package com.cowaine.firewoody237.first_mission.account.factory;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountCreateCommand;
import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;
import com.cowaine.firewoody237.first_mission.account.domain.Currency;
import com.cowaine.firewoody237.first_mission.account.domain.Deposit;
import com.cowaine.firewoody237.first_mission.account.domain.YearlyInterestRate;

public class BankAccountFactory {

    private BankAccountFactory() {

    }

    public static BankAccount createBankAccount(BankAccountCreateCommand command) {
        if (command.getYearlyInterestRate() == 0) {
            return new BankAccount(
                    command.getCustomerId(),
                    Currency.of(command.getCurrency()),
                    new Deposit(command.getDepositAmount())
            );
        }

        return new BankAccount(
                command.getCustomerId(),
                Currency.of(command.getCurrency()),
                new Deposit(command.getDepositAmount()),
                new YearlyInterestRate(command.getYearlyInterestRate())
        );
    }
}
