package com.cowaine.corock.chapter09.reservation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductReservationService {

    private final Reservations reservations;

    void reserve(Product product) {
        try {
            reservations.add(product);
        } catch (IllegalArgumentException e) {
            // 오류를 보고하고, 로그에 기록
            reportError(e);

            // 상위 레이어에 오류와 관련된 통지 요구
            requestNotifyError("예약할 수 없는 상품입니다.");
        }
    }

    private void reportError(IllegalArgumentException e) {
        // (...)
    }

    private void requestNotifyError(String message) {
        // (...)
    }

}
