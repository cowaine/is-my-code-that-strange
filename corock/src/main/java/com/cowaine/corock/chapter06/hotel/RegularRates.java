package com.cowaine.corock.chapter06.hotel;

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
