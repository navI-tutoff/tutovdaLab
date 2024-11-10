package tech.reliab.course.tutovda.bank.entity;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class BankOffice {
    private int id = (int) (1 + Math.random() * 10000);
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

    public BankOffice(String name, String address) {
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
