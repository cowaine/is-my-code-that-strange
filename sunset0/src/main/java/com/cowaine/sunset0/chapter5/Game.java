package com.cowaine.sunset0.chapter5;

public class Game {

    private Party party;

    //5.30 줄줄이 호출하는 메서드 체인
    void equipArmor(int memberId, Amor newArmor) {
        if(party.members[memberId].equipments.canChange) {
            party.members[memberId].equipments.armor = newArmor;
        }
    }


    private static class Equipments {
        boolean canChange = true;
        Amor armor;
    }

    private static class Party {
        Member members[];

    }

    private static class Member {
        Equipments equipments;

    }

    private static class Amor {
    }
}
