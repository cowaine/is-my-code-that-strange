package com.cowaine.firewoody237.first_mission.account.domain;

import com.cowaine.firewoody237.first_mission.account.domain.YearlyInterestRate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class YearlyInterestRateTest {

    @Test
    @DisplayName("이자율을 생성할 수 있다.")
    void test1() {
        YearlyInterestRate yearlyInterestRate = new YearlyInterestRate(0.07);

        assertThat(yearlyInterestRate.getInterestRate())
                .isEqualTo(0.07);
    }

    @Test
    @DisplayName("이자율을 설정하지 않으면 기본 이자율인 0.03이 설정된다.")
    void test2() {
        YearlyInterestRate yearlyInterestRate = new YearlyInterestRate();

        assertThat(yearlyInterestRate.getInterestRate())
                .isEqualTo(0.03);
    }

    @Test
    @DisplayName("이자율은 음수일 수 없다.")
    void test3() {
        Assertions.assertThatThrownBy(
                () -> new YearlyInterestRate(-0.03)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
