package com.cowaine.snoopingh.chap02;

public class Damage {
    int sumUpPlayerAttackerPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

    int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
        return enemyBodyDefence + enemyArmorDefence;
    }

    int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);

        if (damageAmount < 0) {
            return 0;
        }

        return damageAmount;
    }
}
