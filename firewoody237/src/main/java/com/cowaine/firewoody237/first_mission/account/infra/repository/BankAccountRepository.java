package com.cowaine.firewoody237.first_mission.account.infra.repository;

import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;

import java.util.List;

public interface BankAccountRepository {
    void createBankAccount(BankAccount bankAccount);
    BankAccount findBankAccountByCustomerProfileId(long customerProfileId);
    List<BankAccount> findAllBankAccounts();
}
