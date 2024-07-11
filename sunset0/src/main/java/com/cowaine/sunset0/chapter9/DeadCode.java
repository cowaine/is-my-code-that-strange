package com.cowaine.sunset0.chapter9;
//9.1 데드 코드
public class DeadCode {

    private int level;

    public void deadCode() {
        if (level > 90) {
            level = 99;
        }

        // 생략

        if (level == 1) {

        } else if (level == 100) {
            addSpecialAbility(); //데드 코드 : 도달 불가능
        }
    }

    private void addSpecialAbility() {
    }
}
