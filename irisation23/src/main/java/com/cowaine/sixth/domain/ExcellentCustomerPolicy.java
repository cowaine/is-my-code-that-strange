package com.cowaine.sixth.domain;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class ExcellentCustomerPolicy {
    private final Set<ExcellentCustomerRule> rules;

    void add(final ExcellentCustomerRule rule) {
        rules.add(rule);
    }

    boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentCustomerRule each : rules) {
            if (!each.ok(history)) return false;
        }

        return true;
    }
}
