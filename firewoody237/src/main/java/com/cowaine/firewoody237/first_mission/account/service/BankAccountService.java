package com.cowaine.firewoody237.first_mission.account.service;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountCreateCommand;
import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;
import com.cowaine.firewoody237.first_mission.account.factory.BankAccountFactory;
import com.cowaine.firewoody237.first_mission.account.infra.repository.BankAccountRepository;

import java.util.List;

public class BankAccountService {
    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {
        this.repository = repository;
    }

    public void createBankAccount(BankAccountCreateCommand command) {
        BankAccount bankAccount = BankAccountFactory.createBankAccount(command);
        repository.createBankAccount(bankAccount);
    }

    public BankAccount findBankAccountByCustomerProfileId(long customerProfileId) {
        return repository.findBankAccountByCustomerProfileId(customerProfileId);
    }

    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (!from.isCorrectCurrencyWith(to)) {
            throw new IllegalArgumentException("통화가 일치하지 않습니다.");
        }

        if (from.cannotWithdraw(amount)) {
            throw new IllegalArgumentException("인출할 금액이 예치금보다 더 큽니다. 인출할 수 없습니다.");
        }

        from.withdraw(amount);
        to.deposit(amount);
    }

    public void yearlyInterestDeposit() {
        List<BankAccount> allBankAccounts = repository.findAllBankAccounts();
        allBankAccounts.forEach(
                BankAccount::depositInterest
        );
    }
}
