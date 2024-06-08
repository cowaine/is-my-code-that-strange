package com.cowaine.corock;

import com.cowaine.corock.chapter01.game.Magic;
import com.cowaine.corock.chapter01.game.Member;
import com.cowaine.corock.chapter01.game.RpgService;

public class Main {

    public static void main(String[] args) {
        RpgService rpgService = new RpgService();
        Member member = new Member();
        Magic magic = new Magic();

        rpgService.cast(member, magic);
    }

}
