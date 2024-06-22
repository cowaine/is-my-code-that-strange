package com.cowaine.corock.chapter05.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class TaxRate {

    private final BigDecimal value;

}
