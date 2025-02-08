package com.cowaine.firewoody237.first_mission.customer.service;

import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileCreateCommand;
import com.cowaine.firewoody237.first_mission.customer.infra.repository.CustomerProfileRepository;
import com.cowaine.firewoody237.first_mission.customer.infra.repository.InMemoryCustomerProfileRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerProfileServiceTest {

    private final CustomerProfileRepository repository = new InMemoryCustomerProfileRepository();
    private final CustomerProfileService service = new CustomerProfileService(repository);

    @Test
    @DisplayName("고객 프로필을 생성할 수 있다.")
    void test1() {
        CustomerProfileCreateCommand command = new CustomerProfileCreateCommand(1, "김첨지");
        service.createCustomerProfile(command);

        assertThat(service.findCustomerProfile(1).getId())
                .isEqualTo(1);
    }

    @Test
    @DisplayName("모든 고객 프로필을 조회할 수 있다.")
    void test2() {
        CustomerProfileCreateCommand command1 = new CustomerProfileCreateCommand(1, "김첨지");
        CustomerProfileCreateCommand command2 = new CustomerProfileCreateCommand(2, "뉴진스");
        service.createCustomerProfile(command1);
        service.createCustomerProfile(command2);

        assertThat(service.findAllCustomerProfiles())
                .hasSize(2);
    }
}
