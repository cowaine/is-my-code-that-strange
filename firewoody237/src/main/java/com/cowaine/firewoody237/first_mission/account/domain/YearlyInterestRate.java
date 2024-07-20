package com.cowaine.firewoody237.first_mission.account.domain;

public class YearlyInterestRate {
    public static final double DEFAULT_INTEREST_RATE = 0.03;
    private final double value;

    public YearlyInterestRate(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("이자율은 음수일 수 없습니다.");
        }

        this.value = value;
    }

    public YearlyInterestRate() {
        this.value = DEFAULT_INTEREST_RATE;
    }

    public double getInterestRate() {
        return value;
    }
}
