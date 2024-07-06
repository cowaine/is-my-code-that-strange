package com.cowaine.firewoody237.one_to_six.good_code;

import com.cowaine.firewoody237.one_to_six.bad_code.PurchaseHistory;

public class ReturnRateRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return history.returnRate <= 0.001;
    }
}
