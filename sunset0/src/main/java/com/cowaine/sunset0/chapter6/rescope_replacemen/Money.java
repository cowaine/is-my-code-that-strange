package com.cowaine.sunset0.chapter6.rescope_replacemen;

public class Money {

    int value;
    public Money(int value) {
        this.value = value;
    }

    public Money add(Money money) {
        int newValue = money.value + this.value;
        return new Money(newValue);
    }

    public static void main(String[] args) {
        HotelRates hotelRates = new RegularRates();
        Money busySeasonFee = hotelRates.busySeasonFee();
    }
}
