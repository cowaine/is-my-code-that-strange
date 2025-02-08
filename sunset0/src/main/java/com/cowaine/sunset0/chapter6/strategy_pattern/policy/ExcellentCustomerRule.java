package com.cowaine.sunset0.chapter6.strategy_pattern.policy;

public interface ExcellentCustomerRule {
    boolean ok(final PurchaseHistory history);
}
