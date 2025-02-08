package com.cowaine.coalong.chapter05;

import java.math.BigDecimal;

public class AmountIncludingTax {
    final BigDecimal value;

    public AmountIncludingTax(final AmountIncludingTax amountIncludingTax, final TaxRate taxRate) {
        value = amountIncludingTax.value.multiply(taxRate.value);
    }
}
