package com.cowaine.nineth.seven.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Getter
public class Reservation {

    private final Product product;
}
