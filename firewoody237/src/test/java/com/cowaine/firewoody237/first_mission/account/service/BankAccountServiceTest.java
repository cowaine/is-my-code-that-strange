package com.cowaine.firewoody237.first_mission.account.service;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountCreateCommand;
import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;
import com.cowaine.firewoody237.first_mission.account.infra.repository.BankAccountRepository;
import com.cowaine.firewoody237.first_mission.account.infra.repository.InMemoryBankAccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BankAccountServiceTest {
    private final BankAccountRepository repository = new InMemoryBankAccountRepository();
    private final BankAccountService service = new BankAccountService(repository);

    @Test
    @DisplayName("계좌를 생성할 수 있다.")
    void test1() {
        BankAccountCreateCommand command = new BankAccountCreateCommand(
                1L,
                "WON",
                10000,
                0.1
        );
        service.createBankAccount(command);

        assertThat(service.findBankAccountByCustomerProfileId(1L).getCustomerId())
                .isEqualTo(1L);
    }

    @Test
    @DisplayName("A계좌에서 B계좌로 이체할 수 있다.")
    void test2() {
        BankAccountCreateCommand command1 = new BankAccountCreateCommand(
                1L,
                "WON",
                10000
        );
        service.createBankAccount(command1);

        BankAccountCreateCommand command2 = new BankAccountCreateCommand(
                2L,
                "WON",
                10000
        );
        service.createBankAccount(command2);

        BankAccount from = service.findBankAccountByCustomerProfileId(1L);
        BankAccount to = service.findBankAccountByCustomerProfileId(2L);

        service.transfer(from, to, 10000);

        assertThat(from.toVO().getDeposit().getAmount())
                .isZero();
        assertThat(to.toVO().getDeposit().getAmount())
                .isEqualTo(20000);
    }

    @Test
    @DisplayName("통화가 다르면 이체가 불가능하다.")
    void test3() {
        BankAccountCreateCommand command1 = new BankAccountCreateCommand(
                1L,
                "WON",
                10000
        );
        service.createBankAccount(command1);

        BankAccountCreateCommand command2 = new BankAccountCreateCommand(
                2L,
                "US_Dollar",
                10000
        );
        service.createBankAccount(command2);

        BankAccount from = service.findBankAccountByCustomerProfileId(1L);
        BankAccount to = service.findBankAccountByCustomerProfileId(2L);

        assertThatThrownBy(
                () -> service.transfer(from, to, 10000)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("이체를 진행할 때 잔액이 부족하면 불가능하다.")
    void test4() {
        BankAccountCreateCommand command1 = new BankAccountCreateCommand(
                1L,
                "WON",
                1000
        );
        service.createBankAccount(command1);

        BankAccountCreateCommand command2 = new BankAccountCreateCommand(
                2L,
                "WON",
                10000
        );
        service.createBankAccount(command2);

        BankAccount from = service.findBankAccountByCustomerProfileId(1L);
        BankAccount to = service.findBankAccountByCustomerProfileId(2L);

        assertThatThrownBy(
                () -> service.transfer(from, to, 10000)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("연이자를 지급한다.")
    void test5() {
        BankAccountCreateCommand command1 = new BankAccountCreateCommand(
                1L,
                "WON",
                1000,
                0.1
        );
        service.createBankAccount(command1);

        BankAccountCreateCommand command2 = new BankAccountCreateCommand(
                2L,
                "WON",
                10000,
                0.2
        );
        service.createBankAccount(command2);

        service.yearlyInterestDeposit();

        assertThat(service.findBankAccountByCustomerProfileId(1L).toVO().getDeposit().getAmount())
                .isEqualTo(1100);
        assertThat(service.findBankAccountByCustomerProfileId(2L).toVO().getDeposit().getAmount())
                .isEqualTo(12000);
    }
}
