package com.cowaine.sunset0.chapter4.reassignment;

public class Damage {
    private Member member = new Member();
    private Enemy enemy = new Enemy();

    // 코드 4.1 변수 tmp에 여러 번 재할당하기
    int damageV1() {
        int tmp = member.power() + member.weaponAttack();
        tmp = (int) (tmp * (1f + member.spped() / 100f));
        tmp = tmp - (int) (enemy.defence / 2);
        tmp = Math.max(0, tmp);
        return tmp;
    }

    // 4.2 지역 변수에 final을 붙여 기계적으로 재할당 막기
    void doSomething() {
        final int value = 100;
        //컴파일 오류
//        value = 200;
    }

    // 코드 4.3 변수 개별적인 불변 지역 변수를 사용하는 형태로 변경하기
    int damagwV2() {
        final int tmp = member.power() + member.weaponAttack();
        final int finalAttackPower = (int) (tmp * (1f + member.spped() / 100f));
        final int reduction = tmp - (int) (enemy.defence / 2);
        final int damage = Math.max(0, tmp);
        return tmp;
    }


    public static class Enemy {
        public int defence;
    }

    public static class Member {
        public int power() {
            return 100;
        }

        public int weaponAttack() {
            return 100;
        }

        public float spped() {
            return 5;
        }
    }
}
