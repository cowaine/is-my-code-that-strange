package com.cowaine.coalong.mission.bank;

// 마이너스 통장 상속으로 가능?
public class OverdraftAccount extends Account {
    public OverdraftAccount(Money balance) {
        super(balance);
    }
}
