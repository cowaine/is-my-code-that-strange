package com.cowaine.corock.chapter08.mailing;

import com.cowaine.corock.chapter08.util.MailMagazine;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MailMagazineService {

    // 메일 매거진
    private final MailMagazine mailMagazine;

    // (...)

    void beginSend() {
        // mailMagazine 을 사용한 메일 발송 처리
    }

}
