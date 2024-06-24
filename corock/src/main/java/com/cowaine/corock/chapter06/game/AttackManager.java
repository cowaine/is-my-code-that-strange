package com.cowaine.corock.chapter06.game;

public class AttackManager {

    public int attackPower(MagicType magicType, Member member) {
        int attackPower = 0;

        switch (magicType) {
            case FIRE:
                attackPower = 20 + (int) (member.getLevel() * 0.5);
                break;
            case LIGHTING:
                attackPower = 50 + (int) (member.getLevel() * 1.5);
                break;
            // 추가를 깜빡함
            // case HELL_FIRE:
        }

        return attackPower;
    }

}
