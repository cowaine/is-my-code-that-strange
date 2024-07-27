package com.cowaine.corock.chapter14.webtoon;

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

    public boolean isDisabled() {
        return !this.isEnabled();
    }

}
