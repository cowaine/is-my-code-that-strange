package com.cowaine.firewoody237.first_mission.ui.printer;

import com.cowaine.firewoody237.first_mission.ui.data.CustomerBankAccountVO;

import java.util.List;

public class Output {

    // 출력 예시 : 1 이하늘 님 입금한 돈: 5000000 WON, 이자율: 3.0%
    public static void printCustomerBankAccount(List<CustomerBankAccountVO> customerBankAccounts) {
        int guideIndex = 1;
        for (CustomerBankAccountVO customerBankAccount : customerBankAccounts) {
            String format = String.format(
                    "%d %s 님 입금한 돈: %d %s, 이자율: %.1f%%",
                    guideIndex++,
                    customerBankAccount.getCustomerProfileVO().getName(),
                    customerBankAccount.getBankAccountVO().getDeposit().getAmount(),
                    customerBankAccount.getBankAccountVO().getCurrency().getValue(),
                    customerBankAccount.getBankAccountVO().getYearlyInterestRate().getInterestRate() * 100
            );
            System.out.println(format);
        }
    }
}
