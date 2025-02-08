package com.cowaine.firewoody237.first_mission.account.domain;

import com.cowaine.firewoody237.first_mission.account.domain.Deposit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DepositTest {

    @Test
    @DisplayName("예치금은 음수일 수 없다.")
    void test1() {
        assertThatThrownBy(
                () -> new Deposit(-100)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("금액을 더할 수 있다.")
    void test2() {
        Deposit deposit = new Deposit(10000);

        Deposit afterDeposit = deposit.add(new Deposit(1000));

        assertThat(afterDeposit.getAmount())
                .isEqualTo(11000);
    }

    @Test
    @DisplayName("금액을 뺄 수 있다.")
    void test3() {
        Deposit deposit = new Deposit(10000);

        Deposit afterDeposit = deposit.minus(new Deposit(1000));

        assertThat(afterDeposit.getAmount())
                .isEqualTo(9000);
    }

    @Test
    @DisplayName("예치금을 넘는 금액을 뺄 수 없다.")
    void test4() {
        Deposit deposit = new Deposit(10000);

        assertThatThrownBy(
                () -> deposit.minus(new Deposit(100000))
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
