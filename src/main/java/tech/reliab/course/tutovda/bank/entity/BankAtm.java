package tech.reliab.course.tutovda.bank.entity;

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

    public BankAtm() {}

    public BankAtm(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public BankAtm(int id, String name, String address, Status status, Bank bank, BankOffice bankOffice,
                   Employee employee, boolean isCashOutputAvailable, boolean isCashInputAvailable,
                   long totalMoney, int maintenancePrice) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.status = status;
        this.bank = bank;
        this.bankOffice = bankOffice;
        this.employee = employee;
        this.isCashOutputAvailable = isCashOutputAvailable;
        this.isCashInputAvailable = isCashInputAvailable;
        this.totalMoney = totalMoney;
        this.maintenancePrice = maintenancePrice;
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

    public String toString() {
        return "*** Bank Atm Info ***\n" +
                "id -> " + id + '\n' +
                "name -> " + name + '\n' +
                "address -> " + address + '\n' +
                "status -> " + status + '\n' +
                "bank -> " + bank + '\n' +
                "bank office -> " + bankOffice + '\n' +
                "employee -> " + employee + '\n' +
                "cash output available -> " + isCashOutputAvailable + '\n' +
                "cash input available -> " + isCashInputAvailable + '\n' +
                "total money -> " + totalMoney + '\n' +
                "maintenance price -> " + maintenancePrice + '\n' +
                "*** ************* ***";
    }

    // ============== getters & setters ==============
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean isCashOutputAvailable() {
        return isCashOutputAvailable;
    }

    public void setCashOutputAvailable(boolean cashOutputAvailable) {
        isCashOutputAvailable = cashOutputAvailable;
    }

    public boolean isCashInputAvailable() {
        return isCashInputAvailable;
    }

    public void setCashInputAvailable(boolean cashInputAvailable) {
        isCashInputAvailable = cashInputAvailable;
    }

    public long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getMaintenancePrice() {
        return maintenancePrice;
    }

    public void setMaintenancePrice(int maintenancePrice) {
        this.maintenancePrice = maintenancePrice;
    }
}
