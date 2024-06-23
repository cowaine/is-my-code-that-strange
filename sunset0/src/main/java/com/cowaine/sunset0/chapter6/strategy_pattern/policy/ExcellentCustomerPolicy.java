package com.cowaine.sunset0.chapter6.strategy_pattern.policy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExcellentCustomerPolicy {
    private final Set<ExcellentCustomerRule> rules;

    public ExcellentCustomerPolicy() {
        this.rules = new HashSet<>();
    }

    void add(final ExcellentCustomerRule rule) {
        rules.add(rule);
    }

    boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentCustomerRule each : rules) {
            if(!each.ok(history)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
        goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule()); //실버 회원 정책이라면 이 룰이 추가되지 않는다.
        goldCustomerPolicy.add(new PurchaseFrequencyRule());
        goldCustomerPolicy.add(new ReturnRateRule());


        PurchaseHistory purchaseHistory = new PurchaseHistory(1, 2, 3);
        boolean isGoldCustomer = goldCustomerPolicy.complyWithAll(purchaseHistory);
        System.out.println("isGoldCustomer = " + isGoldCustomer);
    }
}
