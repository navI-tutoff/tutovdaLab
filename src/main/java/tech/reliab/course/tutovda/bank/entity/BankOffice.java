package tech.reliab.course.tutovda.bank.entity;

import lombok.*;
import tech.reliab.course.tutovda.bank.service.BankOfficeService;


@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames = true)
public class BankOffice {
    private static int counterId;

    private int id = 0;
    private String name = "-";
    private String address = "-";
    private Bank bank = null;
    private boolean isWorking = false;
    private boolean isAtmPlaceable = false;
    private int atmsAmount = 0;
    private boolean isCreditAvailable = false;
    private boolean isCashOutputAvailable = false;
    private boolean isCashInputAvailable = false;
    private long totalMoney = 0;
    private int rentPrice = 0;

    // special initialization with incrementing global counter
    private void initId() {
        id = counterId++;
    }

    public BankOffice() {
        initId();
    }

    public BankOffice(String name, String address) {
        initId();
        this.name = name;
        this.address = address;
    }

    public BankOffice(BankOffice bankOffice) {
        this.id = bankOffice.id;
        this.name = bankOffice.name;
        this.address = bankOffice.address;
        this.bank = new Bank(bankOffice.bank);
        this.isWorking = bankOffice.isWorking;
        this.isAtmPlaceable = bankOffice.isAtmPlaceable;
        this.atmsAmount = bankOffice.atmsAmount;
        this.isCreditAvailable = bankOffice.isCreditAvailable;
        this.isCashOutputAvailable = bankOffice.isCashOutputAvailable;
        this.isCashInputAvailable = bankOffice.isCashInputAvailable;
        this.totalMoney = bankOffice.totalMoney;
        this.rentPrice = bankOffice.rentPrice;
    }
}
