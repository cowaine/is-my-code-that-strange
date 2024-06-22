package com.cowaine.sunset0.chapter4.variability_effects;

// 4.21 나타내는 클래스 (개선 버전)
public class WeaponV2 {
    final AttackPowerV2 attackPowerV2;

    public WeaponV2(final AttackPowerV2 attackPowerV2) {
        this.attackPowerV2 = attackPowerV2;
    }


    /**
     * 무기 강화하기
     * @param increment 공겨력 강화
     * @return 강화된 무기
     * @throws IllegalAccessException
     */
    WeaponV2 reinforce(final AttackPowerV2 increment) throws IllegalAccessException {
        AttackPowerV2 reinforced = attackPowerV2.reinforce(increment);
        return new WeaponV2(reinforced);
    }

    // 4.22 AttackPower와 Weapon 사용 (개선 버전)
    public static void main(String[] args) throws IllegalAccessException {

        AttackPowerV2 attackPowerA = new AttackPowerV2(20);
        AttackPowerV2 attackPowerB = new AttackPowerV2(20);
        WeaponV2 weaponA = new WeaponV2(attackPowerA);
        WeaponV2 weaponB = new WeaponV2(attackPowerB);
        final AttackPowerV2 increment = new AttackPowerV2(5);
        final WeaponV2 reinforcedWeaponA = weaponA.reinforce(increment);

        System.out.println("weaponA attack power = " + weaponA.attackPowerV2.value);
        System.out.println("reinforced weaponA attack power = " + reinforcedWeaponA.attackPowerV2.value);
        System.out.println("weaponB attack power = " + weaponB.attackPowerV2.value);

    }

}
