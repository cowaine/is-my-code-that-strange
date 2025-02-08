package com.cowaine.firewoody237.first_mission.ui;

import com.cowaine.firewoody237.first_mission.account.data.BankAccountCreateCommand;
import com.cowaine.firewoody237.first_mission.account.infra.repository.InMemoryBankAccountRepository;
import com.cowaine.firewoody237.first_mission.account.service.BankAccountService;
import com.cowaine.firewoody237.first_mission.application.BankApplication;
import com.cowaine.firewoody237.first_mission.customer.data.CustomerProfileCreateCommand;
import com.cowaine.firewoody237.first_mission.customer.infra.repository.InMemoryCustomerProfileRepository;
import com.cowaine.firewoody237.first_mission.customer.service.CustomerProfileService;
import com.cowaine.firewoody237.first_mission.ui.data.InputParsedResult;
import com.cowaine.firewoody237.first_mission.ui.printer.Input;
import com.cowaine.firewoody237.first_mission.ui.printer.Output;

public class MainApplication {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication(
                new CustomerProfileService(new InMemoryCustomerProfileRepository()),
                new BankAccountService(new InMemoryBankAccountRepository())
        );

        initialize(bankApplication);

        System.out.println("=== 가입 계좌 현황 ===");
        Output.printCustomerBankAccount(bankApplication.getAllBankAccount());

        bankApplication.depositInterest();
        System.out.println();

        System.out.println("=== 이자 적용 후 계좌 현황 ===");
        Output.printCustomerBankAccount(bankApplication.getAllBankAccount());
    }

    private static void initialize(BankApplication bankApplication) {
        String user1 = "이하늘 WON 5,000,000";
        String user2 = "박준영 WON 4,000,000";
        String user3 = "정혜진 WON 4,100,000";

        InputParsedResult parsedUser1 = Input.parseInput(user1);
        InputParsedResult parsedUser2 = Input.parseInput(user2);
        InputParsedResult parsedUser3 = Input.parseInput(user3);

        bankApplication.newJoin(
                new CustomerProfileCreateCommand(
                        1L,
                        parsedUser1.getName()
                ),
                new BankAccountCreateCommand(
                        1L,
                        parsedUser1.getCurrency(),
                        parsedUser1.getAmount()
                )
        );

        bankApplication.newJoin(
                new CustomerProfileCreateCommand(
                        2L,
                        parsedUser2.getName()
                ),
                new BankAccountCreateCommand(
                        2L,
                        parsedUser2.getCurrency(),
                        parsedUser2.getAmount()
                )
        );

        bankApplication.newJoin(
                new CustomerProfileCreateCommand(
                        3L,
                        parsedUser3.getName()
                ),
                new BankAccountCreateCommand(
                        3L,
                        parsedUser3.getCurrency(),
                        parsedUser3.getAmount()
                )
        );
    }
}
