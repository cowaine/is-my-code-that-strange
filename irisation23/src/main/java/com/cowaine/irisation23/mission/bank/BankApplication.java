package com.cowaine.irisation23.mission.bank;

import com.cowaine.irisation23.mission.bank.domain.Account;
import com.cowaine.irisation23.mission.bank.domain.Bank;
import com.cowaine.irisation23.mission.bank.domain.Client;
import com.cowaine.irisation23.mission.bank.domain.Currency;
import com.cowaine.irisation23.mission.bank.domain.Dept;
import com.cowaine.irisation23.mission.bank.domain.Money;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BankApplication {

    public static void main(String[] args) {
        Client 이하늘 = Client.of(makeSerialNumber(), "이하늘", Money.of(BigDecimal.valueOf(5000000), Currency.WON),
            Dept.EMPTY);
        Client 박준영 = Client.of(makeSerialNumber(), "박준영", Money.of(BigDecimal.valueOf(4000000), Currency.WON),
            Dept.EMPTY);
        Client 최지영 = Client.of(makeSerialNumber(), "최지영", Money.EMPTY, Dept.of(BigDecimal.valueOf(5700000),
            Currency.WON));
        Client 정혜진 = Client.of(makeSerialNumber(), "정혜진", Money.of(BigDecimal.valueOf(4100000), Currency.WON),
            Dept.EMPTY);
        Client 황석민 = Client.of(makeSerialNumber(), "황석민", Money.of(BigDecimal.valueOf(6000000), Currency.YEN),
            Dept.EMPTY);

        List<Client> clients = List.of(이하늘, 박준영, 최지영, 정혜진, 황석민);

        Bank bank = Bank.of("A", new HashMap<>());
        Bank 가입_계좌 = bank.createAccounts("예금 계좌", clients);

        System.out.println("=== 가입 계좌 현황 ===");
        Map<String, Account> accounts = 가입_계좌.getAccounts();
        int signUpAccountCnt = 0;
        for (Account account : accounts.values()) {
            System.out.println(++signUpAccountCnt + " " + account.getClient().getName() + " 님 입금한 돈: " + account.getClient().getMoney().getValue() + " 이자율: " + account.getInterestRate() + "%");
        }

        System.out.println("=== 이자 적용 후 계좌 현황 ===");
        가입_계좌.interestRateApply();
        int appliedAccountCnt = 0;
        for (Account account : accounts.values()) {
            System.out.println(++appliedAccountCnt+ " " + account.getClient().getName() + " 님 입금한 돈: " + account.getClient().getMoney().getValue() + " 이자율: " + account.getInterestRate() + "%" );
        }

        System.out.println("=== 서로 다른 통화 예금 시도 테스트 ===");
        if (!황석민.sameCurrency(정혜진)) {
            System.out.println("통화가 일치하지 않습니다.");
        }
    }

    private static String makeSerialNumber() {
        return UUID.randomUUID().toString();
    }
}
