package com.cowaine.firewoody237.one_to_six.bad_code;

public class Coupling {

    // 데이터는 외부의 데이터를 사용하고, 메서드는 여기에 있다.
    static int add(int moneyAmount1, int moneyAmount2) {
        return moneyAmount1 + moneyAmount2;
    }
}
