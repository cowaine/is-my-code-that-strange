package com.cowaine.corock.chapter05.game;

public class Game {

    Party party;

    /**
     * 갑옷을 장착한다.
     *
     * @param memberId 장비를 변경하고 싶은 멤버의 ID
     * @param newArmor 입을 갑옷
     */
    void equipArmor(int memberId, Armor newArmor) {
        if (party.members[memberId].equipments.canChange) {
            party.members[memberId].equipments.armor = newArmor;
        }
    }

}
