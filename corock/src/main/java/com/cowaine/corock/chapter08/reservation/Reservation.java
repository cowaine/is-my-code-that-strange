package com.cowaine.corock.chapter08.reservation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Reservation {

    // 상품 예약 ID
    private final int reservationId;

    // (...)

    void cancel() {
        // reservationId 를 사용한 예약 취소 처리
    }

}
