package com.cowaine.corock.chapter06.customer;

import java.util.HashSet;
import java.util.Set;

public class ExcellentCustomerPolicy {

    private final Set<ExcellentCustomerRule> rules;

    public ExcellentCustomerPolicy() {
        this.rules = new HashSet<>();
    }

    /**
     * 규칙을 추가한다.
     *
     * @param rule 규칙
     */
    public void add(final ExcellentCustomerRule rule) {
        rules.add(rule);
    }

    /**
     * 규칙을 모두 만족하는지 판정한다.
     *
     * @param history 구매 이력
     * @return 규칙을 모두 만족하는 경우 true
     */
    public boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentCustomerRule each : rules) {
            if (!each.ok(history)) {
                return false;
            }
        }
        return true;
    }

}
