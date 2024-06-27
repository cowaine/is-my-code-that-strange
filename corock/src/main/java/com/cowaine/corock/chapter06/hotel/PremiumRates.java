package com.cowaine.corock.chapter06.hotel;

public class PremiumRates implements HotelRates {

    @Override
    public Money fee() {
        return new Money(120000);
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(50000));
    }

}
