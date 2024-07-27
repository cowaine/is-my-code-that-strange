package com.cowaine.sunset0.chapter14.after;

public class Coustomer {
    public CustomerId id;
    public PurchasePoint possession;

    public boolean isEnable() {
        return false;
    }

    public boolean isShortOfPoint(Comic comic) {
        return comic.currentPurchasePoint.amount <= possession.amount;
    }
}
