package com.cowaine.corock.chapter06.customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PurchaseHistory {

    private final int totalAmount;
    private final int purchaseFrequencyPerMonth;
    private final float returnRate;

}
