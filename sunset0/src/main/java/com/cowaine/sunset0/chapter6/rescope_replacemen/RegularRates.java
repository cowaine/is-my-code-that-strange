package com.cowaine.sunset0.chapter6.rescope_replacemen;


public class RegularRates implements HotelRates{
    @Override
    public Money fee() {
        return new Money(70000);
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(30000));
    }
}
