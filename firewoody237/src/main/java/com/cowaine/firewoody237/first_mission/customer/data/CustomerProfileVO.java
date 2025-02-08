package com.cowaine.firewoody237.first_mission.customer.data;

import lombok.Getter;

@Getter
public class CustomerProfileVO {
    private final long id;
    private final String name;

    public CustomerProfileVO(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
