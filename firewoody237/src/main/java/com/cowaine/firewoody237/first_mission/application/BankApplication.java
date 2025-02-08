package com.cowaine.firewoody237.first_mission.application;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountCreateCommand;
import com.cowaine.firewoody237.first_mission.account.domain.BankAccount;
import com.cowaine.firewoody237.first_mission.account.service.BankAccountService;
import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileCreateCommand;
import com.cowaine.firewoody237.first_mission.customer.domain.CustomerProfile;
import com.cowaine.firewoody237.first_mission.customer.service.CustomerProfileService;
import com.cowaine.firewoody237.first_mission.ui.data.CustomerBankAccountVO;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private final CustomerProfileService customerProfileService;
    private final BankAccountService bankAccountService;

    public BankApplication(CustomerProfileService customerProfileService, BankAccountService bankAccountService) {
        this.customerProfileService = customerProfileService;
        this.bankAccountService = bankAccountService;
    }

    public void newJoin(
            CustomerProfileCreateCommand customerProfileCreateCommand,
            BankAccountCreateCommand bankAccountCreateCommand
    ) {
        try {
            customerProfileService.createCustomerProfile(customerProfileCreateCommand);
            bankAccountService.createBankAccount(bankAccountCreateCommand);
        } catch (Exception e) {
            System.out.println(customerProfileCreateCommand.getName() + " 고객님! 계좌 생성에 실패했습니다.");
            System.out.println(e.getMessage());
        }
    }

    public List<CustomerBankAccountVO> getAllBankAccount() {
        List<CustomerBankAccountVO> bankAccounts = new ArrayList<>();

        List<CustomerProfile> allCustomerProfiles = customerProfileService.findAllCustomerProfiles();
        for (CustomerProfile customerProfile : allCustomerProfiles) {
            BankAccount bankAccount = bankAccountService.findBankAccountByCustomerProfileId(customerProfile.getId());
            bankAccounts.add(new CustomerBankAccountVO(customerProfile.toVO(), bankAccount.toVO()));
        }

        return bankAccounts;
    }

    public void depositInterest() {
        bankAccountService.yearlyInterestDeposit();
    }
}
