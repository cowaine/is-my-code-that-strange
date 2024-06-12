package com.cowaine.second.one;

public class ExactlySendNameArchitecture {

    // 코드 2.1 어떤 일을 하는지 이해하기 힘든 로직
    public void dontUnderstandLogic(int p1, int p2, int d1, int d2) {
        int d = 0;
        d = p1 + p2;
        d = d - ((d1 + d2) / 2);
        if (d < 0) {
            d = 0;
        }
    }

    // 코드 2.2 의도를 알 수 있는 이름 붙이기
    public void understandNaming(int playerArmPower, int playerWeaponPower,
                                 int enemyBodyDefence, int enemyArmorDefence) {

        int damageAmount = 0;
        damageAmount = playerArmPower + playerWeaponPower;
        damageAmount = damageAmount - ((enemyBodyDefence + enemyArmorDefence) / 2);

        if (damageAmount < 0) {
            damageAmount = 0;
        }
    }

    // 코드 2.3 목적 별로 변수 만들어 사용하기
    public void makeTypeOfValue(int playerArmPower, int playerWeaponPower,
                                int enemyBodyDefence, int enemyArmorDefence) {

        int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
        int totalEnemyDefence = enemyBodyDefence + enemyArmorDefence;

        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);

        if (damageAmount < 0) {
            damageAmount = 0;
        }
    }

    // 코드 2.4 의미를 알기 쉽게 메서드로 만들기
    // 플레이어의 공격력 합계 계산
    private int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

    // 적의 방어력 합계 계산
    private int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
        return enemyBodyDefence + enemyArmorDefence;
    }

    // 데미지 평가
    private int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);

        if (damageAmount < 0) {
            return 0;
        }

        return damageAmount;
    }

    // 코드 2.5 메서드를 호출하는 형태로 개선
    public int estimateDamageAmount(int playerArmPower, int playerWeaponPower,
                         int enemyBodyDefence, int enemyArmorDefence) {

        int totalPlayerAttackPower = sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefence = sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);

        return estimateDamage(totalPlayerAttackPower, totalEnemyDefence);
    }
}
