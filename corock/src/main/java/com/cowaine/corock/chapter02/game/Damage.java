package com.cowaine.corock.chapter02.game;

public class Damage {

    public void calculate(int playerArmPower, int playerWeaponPower, int enemyBodyDefense, int enemyArmorDefense) {
        int damageAmount = 0;
        damageAmount = playerArmPower + playerWeaponPower;
        damageAmount = damageAmount - ((enemyBodyDefense + enemyArmorDefense) / 2);

        if (damageAmount < 0) {
            damageAmount = 0;
        }
    }

}
