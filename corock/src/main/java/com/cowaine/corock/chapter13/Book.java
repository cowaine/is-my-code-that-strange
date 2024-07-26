package com.cowaine.corock.chapter13;

import com.cowaine.corock.chapter13.auth.CorporationManager;
import com.cowaine.corock.chapter13.auth.User;
import com.cowaine.corock.chapter13.auth.UserManager;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Book {

    public static void main(String[] args) {
        User individualUser = new User(1, "(주)", "gdhong@gmail.com", "123$", "서울특별시 중구 세종대로 110", "010-1234-5678",
                "안녕하세요~", null, 0, "Dark", LocalDate.now());
        UserManager userManager = new UserManager(individualUser);

        User corporateUser = new User(1, "시라소니", "tpkang@gmail.com", "567*", "부산 해운대구 우동 1408", "010-8765-4321",
                "반갑습니다.", null, 0, "White", "02-345-6789");
        CorporationManager corporationManager = new CorporationManager(individualUser);
        log.info("Corporate user's phone number: {}", corporationManager.getUser().getCorporationNumber());

        corporationManager = new CorporationManager(corporateUser);
        log.info("Individual user's birthday: {}", corporationManager.getUser().getBirthday());

        corporationManager = new CorporationManager(individualUser);
        log.info("이름은 4글자 이상인가? {}", corporationManager.verifyName());

        log.info("사람 이름에 '(주)' 가 없는가? {}", userManager.verifyName());
    }

}
