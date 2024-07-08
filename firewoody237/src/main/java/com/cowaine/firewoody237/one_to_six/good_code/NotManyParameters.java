package com.cowaine.firewoody237.one_to_six.good_code;

public interface NotManyParameters {

    // 실수로 잘못된 값을 대입할 가능성이 높다.
    // 매개변수가 많다는 것은, 해당 메서드가 너무 많은 기능을 처리하려고 하는 경고다.
    int recoverMagicPoint(
            MagicPoint magicPoint,
            int recoveryAmount
    );
}
