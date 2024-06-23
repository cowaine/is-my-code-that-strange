package com.cowaine.sunset0.chapter6.rescope_replacemen;

public class PremiumRates implements HotelRates{
    @Override
    public Money fee() {
        return new Money(120000);
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(50000));
    }
}
