package com.cowaine.irisation23.mission.bank.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Getter
public class Bank {

    private final String name;
    private final Map<String, Account> accounts;

    public Bank createAccounts(String name, final List<Client> clients) {
        for (Client client : clients) {
            try {
                accounts.put(UUID.randomUUID().toString(), Account.of(name, client));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return this;
    }

    public void interestRateApply() {
        for (Entry<String, Account> accountEntry : accounts.entrySet()) {
            String key = accountEntry.getKey();
            Account account = accounts.get(key);
            BigDecimal interestRate = BigDecimal.valueOf(account.getInterestRate()).divide(BigDecimal.valueOf(100));
            BigDecimal interestRateMoneyValue = interestRate.multiply(account.getClient().getMoney().getValue());
            BigDecimal totalAppliedMoneyValue = interestRateMoneyValue.add(account.getClient().getMoney().getValue());

            Account appliedAccount = Account.of(account.getName(),
                Client.of(account.getClient().getClientSerialNumber(),
                    account.getClient().getName(),
                    Money.of(totalAppliedMoneyValue.setScale(0, RoundingMode.DOWN), Currency.WON),
                    Dept.EMPTY));

            accounts.put(key, appliedAccount);
        }
    }
}
