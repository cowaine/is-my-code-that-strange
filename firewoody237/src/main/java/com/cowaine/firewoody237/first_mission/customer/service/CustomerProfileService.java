package com.cowaine.firewoody237.first_mission.customer.service;

import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileCreateCommand;
import com.cowaine.firewoody237.first_mission.customer.domain.CustomerProfile;
import com.cowaine.firewoody237.first_mission.customer.factory.CustomerProfileFactory;
import com.cowaine.firewoody237.first_mission.customer.infra.repository.CustomerProfileRepository;

import java.util.List;

public class CustomerProfileService {
    private final CustomerProfileRepository repository;

    public CustomerProfileService(CustomerProfileRepository repository) {
        this.repository = repository;
    }

    public void createCustomerProfile(CustomerProfileCreateCommand command) {
        CustomerProfile customerProfile = CustomerProfileFactory.createCustomerProfile(command);
        repository.createCustomerProfile(customerProfile);
    }

    public CustomerProfile findCustomerProfile(long customerId) {
        return repository.findCustomerProfile(customerId);
    }

    public List<CustomerProfile> findAllCustomerProfiles() {
        return repository.findAllCustomerProfiles();
    }
}
