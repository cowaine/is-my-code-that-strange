package com.cowaine.corock.chapter06.hotel;

public interface HotelRates {

    Money fee();

    // 성수기 요금
    Money busySeasonFee();

}
