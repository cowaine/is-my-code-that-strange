package com.cowaine.sunset0.chapter4.variability_effects;

//4.6 공격력을 나타내는 클래스
public class AttackPower {
    static final int MIN = 0;
    int value; //final을 붙이지 않았으므로 가변

    public AttackPower(int value) throws IllegalAccessException {
        if (value < MIN) {
            throw new IllegalAccessException();
        }
        this.value = value;
    }

    /**
     * 공격력 강화하기
     * @param increment 공격력 증가량
     */
    void reinforce(int increment) {
        value += increment;
    }

    /**
     * 무력화하기
     */
    void disable() {
        value = MIN;
    }

    public static void main(String[] args) throws IllegalAccessException {
        //4.14 공격력을 강화하는 처리
        AttackPower attackPower = new AttackPower(20);
        //생략
        attackPower.reinforce(15);
        System.out.println("attackPower.value = " + attackPower.value);
    }
}
