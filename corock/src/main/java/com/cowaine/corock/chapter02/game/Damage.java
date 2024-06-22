package com.cowaine.corock.chapter02.game;

public class Damage {

    /**
     * 데미지를 계산한다.
     *
     * @param playerArmPower    플레이어의 공격력
     * @param playerWeaponPower 플레이어의 무기 공격력
     * @param enemyBodyDefense  적의 방어력
     * @param enemyArmorDefense 적의 갑옷 방어력
     * @return 계산된 총 데미지
     */
    public int calculate(int playerArmPower, int playerWeaponPower, int enemyBodyDefense, int enemyArmorDefense) {
        int totalPlayerAttackPower = this.sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefense = this.sumUpEnemyDefense(enemyBodyDefense, enemyArmorDefense);

        return this.estimateDamage(totalPlayerAttackPower, totalEnemyDefense);
    }

    /**
     * 플레이어의 공격력 합계를 반환한다.
     *
     * @param playerArmPower    플레이어의 공격력
     * @param playerWeaponPower 플레이어의 무기 공격력
     * @return 플레이어의 공격력 합계
     */
    private int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

    /**
     * 적의 방어력 합계를 반환한다.
     *
     * @param enemyBodyDefense  적의 방어력
     * @param enemyArmorDefense 적의 갑옷 방어력
     * @return 적의 방어력 합계
     */
    private int sumUpEnemyDefense(int enemyBodyDefense, int enemyArmorDefense) {
        return enemyBodyDefense + enemyArmorDefense;
    }

    /**
     * 데미지를 평가한다.
     *
     * @param totalPlayerAttackPower 플레이어의 총 공격력
     * @param totalEnemyDefense      적의 총 방어력
     * @return 플레이어의 총공격력과 적의 총방어력을 계산한 데미지
     */
    private int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefense) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefense / 2);
        if (damageAmount < 0) {
            damageAmount = 0;
        }

        return damageAmount;
    }

}
