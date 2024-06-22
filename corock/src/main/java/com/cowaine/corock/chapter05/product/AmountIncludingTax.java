package com.cowaine.corock.chapter05.product;

import java.math.BigDecimal;

public class AmountIncludingTax {

    private final BigDecimal value;

    public AmountIncludingTax(final AmountIncludingTax amountIncludingTax, final TaxRate taxRate) {
        this.value = amountIncludingTax.value.multiply(taxRate.getValue());
    }

}
