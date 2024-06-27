package com.cowaine.firewoody237.bad_code;

public class MembershipManager {

    boolean isGoldCustomer(PurchaseHistory history) {
        if (1000000 <= history.totalAmount) {
            if (10 <= history.purchaseFrequencyPerMonth) {
                if (history.returnRate <= 0.001) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isSilverCustomer(PurchaseHistory history) {
        if (10 <= history.purchaseFrequencyPerMonth) {
            if (history.returnRate <= 0.001) {
                return true;
            }
        }
        return false;
    }
}
