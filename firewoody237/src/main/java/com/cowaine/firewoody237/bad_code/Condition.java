package com.cowaine.firewoody237.bad_code;

public class Condition {

    // 분기 중첩
    public void nestedCondition(int input) {
        if (input > 1) {
            // condition 1
            if (input > 2) {
                // nested condition
                if (input > 3) {
                    // nested nested condition
                }
            }
        }
    }
}
