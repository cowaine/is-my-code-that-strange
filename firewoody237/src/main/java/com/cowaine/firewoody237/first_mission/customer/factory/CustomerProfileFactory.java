package com.cowaine.firewoody237.first_mission.customer.factory;

import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileCreateCommand;
import com.cowaine.firewoody237.first_mission.customer.domain.CustomerProfile;

public class CustomerProfileFactory {
    public static CustomerProfile createCustomerProfile(CustomerProfileCreateCommand command) {
        return new CustomerProfile(command.getId(), command.getName());
    }
}
