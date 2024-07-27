package com.cowaine.thirteenth.auth;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class User {

    private int id;                     // 식별 ID
    private String name;                // 이름
    private String email;               // 이메일 주소
    private String passwordDigest;      // 비밀번호
    private String address;             // 주소
    private String phoneNumber;         // 전화번호
    private String bio;                 // 자기소개
    private String url;                 // URL
    private int discountPoint;          // 할인 포인트
    private String themeMode;           // 표시 테마 색
    private LocalDate birthday;         // 생년월일

    // 생략, 이 외에도 수많은 인스턴스 변수를 갖습니다.

    private String corporationNumber;   // 법인 등록번호

    public User(int id, String name, String email, String passwordDigest, String address, String phoneNumber,
                String bio, String url, int discountPoint, String themeMode, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordDigest = passwordDigest;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.url = url;
        this.discountPoint = discountPoint;
        this.themeMode = themeMode;
        this.birthday = birthday;
    }

    public User(int id, String name, String email, String passwordDigest, String address, String phoneNumber,
                String bio, String url, int discountPoint, String themeMode, String corporationNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordDigest = passwordDigest;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.url = url;
        this.discountPoint = discountPoint;
        this.themeMode = themeMode;
        this.corporationNumber = corporationNumber;
    }

}
