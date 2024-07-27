package com.cowaine.coalong.chapter14;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Customer {
    private final CustomerId id;
    private final PurchasePoint possessionPoint;

    public boolean isEnabled() {
        return false;
    }
}
