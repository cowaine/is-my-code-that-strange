package com.cowaine.corock.chapter10.rental;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RentalFee {

    private static final int LATE_RENTAL_FEE_PER_DAY = 100;

    private final int basicRentalFee;
    private final int daysOverDue;

    public int getTotalRentalFee() {
        return basicRentalFee + LATE_RENTAL_FEE_PER_DAY * daysOverDue;
    }

}
