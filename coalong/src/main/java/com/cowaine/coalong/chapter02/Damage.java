package com.cowaine.coalong.chapter02;

public class Damage {

    void calcDamage(int playerArmPower, int playerWeaponPower, int enemyBodyDefence, int enemyArmorDefence) {
        int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
        int totalEnemyDefence = enemyBodyDefence + enemyArmorDefence;
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
        if (damageAmount < 0) {
            damageAmount = 0;
        }
    }
}
