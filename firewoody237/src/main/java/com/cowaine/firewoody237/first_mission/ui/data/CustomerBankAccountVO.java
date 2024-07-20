package com.cowaine.firewoody237.first_mission.ui.data;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountVO;
import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileVO;
import lombok.Getter;

@Getter
public class CustomerBankAccountVO {
    private final CustomerProfileVO customerProfileVO;
    private final BankAccountVO bankAccountVO;

    public CustomerBankAccountVO(CustomerProfileVO customerProfileVO, BankAccountVO bankAccountVO) {
        this.customerProfileVO = customerProfileVO;
        this.bankAccountVO = bankAccountVO;
    }
}
