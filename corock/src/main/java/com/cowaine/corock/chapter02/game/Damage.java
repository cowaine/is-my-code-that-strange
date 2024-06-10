package com.cowaine.corock.chapter02.game;

public class Damage {

    public int calculate(int playerArmPower, int playerWeaponPower, int enemyBodyDefense, int enemyArmorDefense) {
        int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
        int totalEnemyDefense = enemyBodyDefense + enemyArmorDefense;

        int damageAmount = totalPlayerAttackPower - (totalEnemyDefense / 2);
        if (damageAmount < 0) {
            damageAmount = 0;
        }

        return damageAmount;
    }

}
