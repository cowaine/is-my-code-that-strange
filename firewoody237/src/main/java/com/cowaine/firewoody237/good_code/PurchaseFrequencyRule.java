package com.cowaine.firewoody237.good_code;

import com.cowaine.firewoody237.bad_code.PurchaseHistory;

public class PurchaseFrequencyRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 10 <= history.purchaseFrequencyPerMonth;
    }
}
