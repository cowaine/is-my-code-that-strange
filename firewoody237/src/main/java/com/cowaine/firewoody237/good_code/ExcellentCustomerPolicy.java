package com.cowaine.firewoody237.good_code;

import com.cowaine.firewoody237.bad_code.PurchaseHistory;

import java.util.HashSet;
import java.util.Set;

public class ExcellentCustomerPolicy {
    private final Set<ExcellentCustomerRule> rules;

    ExcellentCustomerPolicy() {
        rules = new HashSet<>();
    }

    void add(final ExcellentCustomerRule rule) {
        rules.add(rule);
    }

    boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentCustomerRule each : rules) {
            if (!each.ok(history)) return false;
        }
        return true;
    }

    void usingIt(PurchaseHistory history) {
        ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
        goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule());
        goldCustomerPolicy.add(new PurchaseFrequencyRule());
        goldCustomerPolicy.add(new ReturnRateRule());

        goldCustomerPolicy.complyWithAll(history);
    }
}
