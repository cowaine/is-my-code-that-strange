package com.cowaine.corock.chapter02.game;

public class Damage {

    public int calculate(int playerArmPower, int playerWeaponPower, int enemyBodyDefense, int enemyArmorDefense) {
        int totalPlayerAttackPower = this.sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefense = this.sumUpEnemyDefense(enemyBodyDefense, enemyArmorDefense);

        return this.estimateDamage(totalPlayerAttackPower, totalEnemyDefense);
    }

    // 플레이어의 공격력 합계 계산
    private int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

    // 적의 방어력 합계 계산
    private int sumUpEnemyDefense(int enemyBodyDefense, int enemyArmorDefense) {
        return enemyBodyDefense + enemyArmorDefense;
    }

    // 데미지 평가
    private int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefense) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefense / 2);
        if (damageAmount < 0) {
            damageAmount = 0;
        }

        return damageAmount;
    }

}
