package tech.reliab.course.tutovda.bank.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class BankAtm {
    public enum Status {NOT_WORKING, WORKING, NO_MONEY}

    private int id = (int) (1 + Math.random() * 10000);
    private String name = "-";
    private String address = "-";
    private Status status = Status.NOT_WORKING;
    private Bank bank = null;
    private BankOffice bankOffice = null;
    private Employee employee = null;
    private boolean isCashOutputAvailable = false;
    private boolean isCashInputAvailable = false;
    private long totalMoney = 0;
    private int maintenancePrice = 0;

    public BankAtm(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public BankAtm(BankAtm bankAtm) {
        this.id = bankAtm.id;
        this.name = bankAtm.name;
        this.address = bankAtm.address;
        this.status = bankAtm.status;
        this.bank = new Bank(bankAtm.bank);
        this.bankOffice = new BankOffice(bankAtm.bankOffice);
        this.employee = new Employee(bankAtm.employee);
        this.isCashOutputAvailable = bankAtm.isCashOutputAvailable;
        this.isCashInputAvailable = bankAtm.isCashInputAvailable;
        this.totalMoney = bankAtm.totalMoney;
        this.maintenancePrice = bankAtm.maintenancePrice;
    }
}
