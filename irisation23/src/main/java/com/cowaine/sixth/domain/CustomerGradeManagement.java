package com.cowaine.sixth.domain;

public class CustomerGradeManagement {
    boolean isGoldCustomer(PurchaseHistory history) {
        if (100000 <= history.getTotalAmount()) {
            if (10 <= history.purchaseFrequencyPerMonth()) {
                if (history.returnRate() <= 0.001) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean isSilverCustomer(PurchaseHistory history) {
        if (10 <= history.purchaseFrequencyPerMonth()) {
            if (history.returnRate() <= 0.001) {
                return true;
            }
        }

        return false;
    }
}
