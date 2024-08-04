package com.cowaine.firewoody237.first_mission.account.domain;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountVO;
import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;
import com.cowaine.firewoody237.first_mission.account.domain.Currency;
import com.cowaine.firewoody237.first_mission.account.domain.Deposit;
import com.cowaine.firewoody237.first_mission.account.domain.YearlyInterestRate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {

    @Test
    @DisplayName("계좌의 이자를 입금하면, 이자 금액만큼 예치금이 올라간다.")
    void test1() {
        BankAccount bankAccount = new BankAccount(
                1L,
                Currency.KOREA_WON,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        bankAccount.depositInterest();
        BankAccountVO vo = bankAccount.toVO();

        assertThat(vo.getDeposit().getAmount())
                .isEqualTo(11000);
    }

    @Test
    @DisplayName("금액을 입금하면 그 금액만큼 더해진다.")
    void test2() {
        BankAccount bankAccount = new BankAccount(
                1L,
                Currency.KOREA_WON,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        bankAccount.deposit(10000);
        BankAccountVO vo = bankAccount.toVO();

        assertThat(vo.getDeposit().getAmount())
                .isEqualTo(20000);
    }

    @Test
    @DisplayName("금액을 출금하면 그 금액만큼 빼진다.")
    void test3() {
        BankAccount bankAccount = new BankAccount(
                1L,
                Currency.KOREA_WON,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        bankAccount.withdraw(10000);
        BankAccountVO vo = bankAccount.toVO();

        assertThat(vo.getDeposit().getAmount())
                .isEqualTo(0);
    }

    @Test
    @DisplayName("계좌간 통화가 동일한지 비교할 수 있다.")
    void test4() {
        BankAccount bankAccount1 = new BankAccount(
                1L,
                Currency.KOREA_WON,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        BankAccount bankAccount2 = new BankAccount(
                1L,
                Currency.KOREA_WON,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        assertThat(bankAccount1.isCorrectCurrencyWith(bankAccount2))
                .isTrue();
    }

    @Test
    @DisplayName("계좌간 통화가 다른지 비교할 수 있다.")
    void test5() {
        BankAccount bankAccount1 = new BankAccount(
                1L,
                Currency.KOREA_WON,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        BankAccount bankAccount2 = new BankAccount(
                1L,
                Currency.US_DOLLAR,
                new Deposit(10000),
                new YearlyInterestRate(0.1)
        );

        assertThat(bankAccount1.isCorrectCurrencyWith(bankAccount2))
                .isFalse();
    }
}
