package com.cowaine.firewoody237.first_mission.customer.infra.repository;

import com.cowaine.firewoody237.first_mission.customer.domain.CustomerProfile;

import java.util.List;

public interface CustomerProfileRepository {
    void createCustomerProfile(CustomerProfile customerProfile);
    CustomerProfile findCustomerProfile(long customerId);
    List<CustomerProfile> findAllCustomerProfiles();
}
