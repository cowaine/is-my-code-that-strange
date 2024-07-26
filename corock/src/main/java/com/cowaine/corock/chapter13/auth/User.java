package com.cowaine.corock.chapter13.auth;

import java.time.LocalDate;

class User {

    int id;                     // 식별 ID
    String name;                // 이름
    String email;               // 이메일 주소
    String passwordDigest;      // 비밀번호
    String address;             // 주소
    String phoneNumber;         // 전화번호
    String bio;                 // 자기소개
    String url;                 // URL
    int discountPoint;          // 할인 포인트
    String themeMode;           // 표시 테마 색
    LocalDate birthday;         // 생년월일

    // 생략, 이 외에도 수많은 인스턴스 변수를 갖습니다.

    String corporationNumber;   // 법인 등록번호

}
