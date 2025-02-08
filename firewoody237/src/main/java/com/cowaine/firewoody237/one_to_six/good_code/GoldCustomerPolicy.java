package com.cowaine.firewoody237.one_to_six.good_code;

import com.cowaine.firewoody237.one_to_six.bad_code.PurchaseHistory;

public class GoldCustomerPolicy {

    private ExcellentCustomerPolicy policy;

    GoldCustomerPolicy() {
        policy = new ExcellentCustomerPolicy();
        policy.add(new GoldCustomerPurchaseAmountRule());
        policy.add(new PurchaseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }

}
