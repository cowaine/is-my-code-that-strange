package com.cowaine.coalong.chapter02;

public class Damage {

    // 데미지를 계산
    int calcDamage(int playerArmPower, int playerWeaponPower, int enemyBodyDefence, int enemyArmorDefence) {
        int totalPlayerAttackPower = sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefence = sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
        return estimateDamage(totalPlayerAttackPower, totalEnemyDefence);
    }

    // 데미지 평가
    private static int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
        if (damageAmount < 0) {
            return 0;
        }
        return damageAmount;
    }

    // 적의 방어력 합계 계산
    private static int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
        return enemyBodyDefence + enemyArmorDefence;
    }

    // 플레이어의 공격력 합계 계산
    private static int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

}
