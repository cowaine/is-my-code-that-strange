package com.cowaine.coalong.chapter02;

public class Naming {

    void calcDamage(int playerArmPower, int playerWeaponPower, int enemyBodyDefence, int enemyArmorDefence) {
        int damageAmount = 0;
        damageAmount = playerArmPower + playerWeaponPower;
        damageAmount = damageAmount - ((enemyBodyDefence + enemyArmorDefence) / 2);
        if (damageAmount < 0) {
            damageAmount = 0;
        }
    }
}
