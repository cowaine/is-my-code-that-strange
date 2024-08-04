package com.cowaine.firewoody237.first_mission.account.domain;

public class Deposit {
    private final int value;

    public Deposit(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Money is not negative: " + value);
        }

        this.value = value;
    }

    public Deposit add(Deposit depositAmount) {
        return new Deposit(this.value + depositAmount.getAmount());
    }

    public Deposit minus(Deposit depositAmount) {
        if (depositAmount.getAmount() > this.value) {
            throw new IllegalArgumentException("예치금 이상의 금액을 출금할 수 없음.");
        }

        return new Deposit(this.value - depositAmount.getAmount());
    }

    public int getAmount() {
        return this.value;
    }
}
