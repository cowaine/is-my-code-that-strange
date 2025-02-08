package com.cowaine.snoopingh.chap06.lsp;

public class RegularRates implements HotelRates {
    @Override
    public Money fee() {
        return new Money(70000);
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(30000));
    }
}
