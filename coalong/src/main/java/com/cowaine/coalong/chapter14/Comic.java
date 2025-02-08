package com.cowaine.coalong.chapter14;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Comic {
    private final ComicId id;
    private final PurchasePoint currentPurchasePoint;

    public boolean isEnabled() {
        return false;
    }
}
