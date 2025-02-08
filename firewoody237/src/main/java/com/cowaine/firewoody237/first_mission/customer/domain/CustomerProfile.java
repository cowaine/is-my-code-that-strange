package com.cowaine.firewoody237.first_mission.customer.domain;

import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileVO;
import lombok.Getter;

public class CustomerProfile {
    @Getter
    private final long id;
    private final String name;

    public CustomerProfile(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerProfileVO toVO() {
        return new CustomerProfileVO(
                this.id,
                this.name
        );
    }
}
