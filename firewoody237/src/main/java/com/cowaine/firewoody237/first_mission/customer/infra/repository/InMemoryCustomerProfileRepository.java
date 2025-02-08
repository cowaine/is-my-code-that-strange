package com.cowaine.firewoody237.first_mission.customer.infra.repository;

import com.cowaine.firewoody237.first_mission.customer.domain.CustomerProfile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCustomerProfileRepository implements CustomerProfileRepository {
    private final Map<Long, CustomerProfile> customerProfiles = new HashMap<>();

    @Override
    public void createCustomerProfile(CustomerProfile customerProfile) {
        customerProfiles.put(customerProfile.getId(), customerProfile);
    }

    @Override
    public CustomerProfile findCustomerProfile(long customerId) {
        if (!customerProfiles.containsKey(customerId)) {
            throw new IllegalArgumentException("존재하지 않는 고객 프로필");
        }

        return customerProfiles.get(customerId);
    }

    @Override
    public List<CustomerProfile> findAllCustomerProfiles() {
        return customerProfiles.values().stream()
                .toList();
    }
}
