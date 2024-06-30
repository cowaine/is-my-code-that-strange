package com.cowaine.corock.chapter08.util;

@Deprecated(forRemoval = true)
public class Utils {

    // 상품 예약 ID
    @Deprecated(forRemoval = true)
    private int reservationId;

    // 화면 표시 설정
    @Deprecated(forRemoval = true)
    private ViewSettings viewSettings;

    // 메일 매거진
    @Deprecated(forRemoval = true)
    private MailMagazine mailMagazine;

    @Deprecated(forRemoval = true)
    void cancelReservation() {
        // reservationId 를 사용한 예약 취소 처리
    }

    @Deprecated(forRemoval = true)
    void darkMode() {
        // viewSettings 를 사용한 다크 모드 표시 전환 처리
    }

    @Deprecated(forRemoval = true)
    void beginSendMail() {
        // mailMagazine 을 사용한 메일 전송 처리
    }

}
