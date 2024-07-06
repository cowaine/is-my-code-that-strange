package com.cowaine.firewoody237.one_to_six.bad_code.anti_pattern;

import java.math.BigDecimal;

public class TrashObject {
    public class ConstractAmount {
        // 비즈니스 로직에 대한 구현이 클래스 밖에서 발생할 수 있음 -> 문제 발생
        public int amountIncludingTax;
        public BigDecimal salesTaxRate;
    }
}
