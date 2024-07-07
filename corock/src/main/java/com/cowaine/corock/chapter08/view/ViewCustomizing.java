package com.cowaine.corock.chapter08.view;

import com.cowaine.corock.chapter08.util.ViewSettings;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ViewCustomizing {

    // 화면 모드 설정
    private final ViewSettings viewSettings;

    // (...)

    void darkMode() {
        // viewSettings 를 사용한 다크 모드 변경 처리
    }

}
