package com.cowaine.firewoody237.bad_code;

public class ReAssign {

    int damage(int power, int attack) {
        int temp = power + attack;
        // 재할당 시 어떤 값을 나타내는지 파악하기 어렵다.
        temp = temp / 100;
        return temp;
    }
}
