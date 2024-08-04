package com.cowaine.firewoody237.first_mission.account.infra.repository;

import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBankAccountRepository implements BankAccountRepository {
    private final Map<Long, BankAccount> bankAccounts = new HashMap<>();

    @Override
    public void createBankAccount(BankAccount bankAccount) {
        bankAccounts.put(bankAccount.getCustomerId(), bankAccount);
    }

    @Override
    public BankAccount findBankAccountByCustomerProfileId(long customerProfileId) {
        if (!bankAccounts.containsKey(customerProfileId)) {
            throw new IllegalArgumentException("해당 고객의 계좌가 존재하지 않습니다.");
        }

        return bankAccounts.get(customerProfileId);
    }

    @Override
    public List<BankAccount> findAllBankAccounts() {
        return bankAccounts.values().stream()
                .toList();
    }
}
