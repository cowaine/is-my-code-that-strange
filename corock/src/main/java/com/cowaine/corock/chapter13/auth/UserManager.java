package com.cowaine.corock.chapter13.auth;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserManager {

    private final User user;

    public boolean verifyName() {
        return !user.getName().contains("(주)");
    }

}
