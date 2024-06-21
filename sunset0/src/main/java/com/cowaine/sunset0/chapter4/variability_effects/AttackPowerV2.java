package com.cowaine.sunset0.chapter4.variability_effects;

//4.18 불변으로 견고해진 AttackPowerV2 클래스
public class AttackPowerV2 {
    static final int MIN = 0;
    final int value;

    public AttackPowerV2(final int value) throws IllegalAccessException {
        if (value < MIN) {
            throw new IllegalAccessException();
        }
        this.value = value;
    }

    /**
     * 공격력 강화하기
     * @param increment 공격력 증가량
     * @return 증가된 공격력
     */
    AttackPowerV2 reinforce(final AttackPowerV2 increment) throws IllegalAccessException {
        return new AttackPowerV2(this.value + increment.value);
    }

    /**
     * 무력화하기
     * @return 무력화한 공격력
     */
    AttackPowerV2 disable() throws IllegalAccessException {
        return new AttackPowerV2(MIN);
    }

    public static void main(String[] args) throws IllegalAccessException {

        //4.19 영향 범위를 줄인 공격력 강화
        AttackPowerV2 attackPower = new AttackPowerV2(20);
        //생략
        AttackPowerV2 reinforced = attackPower.reinforce(new AttackPowerV2(15));
        System.out.println("attackPower.value = " + reinforced.value);

        //4.20 다른 인스턴스를 생성했으므로 영향을 주지 않음
        final AttackPowerV2 disable = attackPower.disable();
    }
}
