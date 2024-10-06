package tech.reliab.course.tutovda.bank.entity;



public class Bank {
    private int id;
    private String name;
    private int officesAmount;
    private int atmsAmount;
    private int employeesAmount;
    private int clientsAmount;
    private byte rating;
    private long totalMoney;
    private int interestRate;

    private void defaultInitialization() {
        id = (int) (1 + Math.random() * 10000);
        name = "-";
        officesAmount = 0;
        atmsAmount = 0;
        employeesAmount = 0;
        clientsAmount = 0;
        rating = 0;
        totalMoney = 0;
        interestRate = 0;
    }

    public Bank() {
        defaultInitialization();
    }

    public Bank(Bank bank) {
        id = bank.id;
        name = bank.name;
        officesAmount = bank.officesAmount;
        atmsAmount = bank.atmsAmount;
        employeesAmount = bank.employeesAmount;
        clientsAmount = bank.clientsAmount;
        rating = bank.rating;
        totalMoney = bank.totalMoney;
        interestRate = bank.interestRate;
    }

    public Bank(String name) {
        defaultInitialization();
        this.name = name;
    }

    public String toString() {
        return "*** Bank Info ***\n" +
                "id -> " + id + '\n' +
                "name -> " + name + '\n' +
                "offices amount -> " + officesAmount + '\n' +
                "atms amount -> " + atmsAmount + '\n' +
                "employees amount -> " + employeesAmount + '\n' +
                "clients amount -> " + clientsAmount + '\n' +
                "rating -> " + rating + '\n' +
                "total money -> " + totalMoney + '\n' +
                "interest rate -> " + interestRate + '\n' +
                "*** ********* ***";
    }

    // ============== getters & setters ==============
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOfficesAmount() {
        return officesAmount;
    }

    public void setOfficesAmount(int officesAmount) {
        this.officesAmount = officesAmount;
    }

    public int getAtmsAmount() {
        return atmsAmount;
    }

    public void setAtmsAmount(int atmsAmount) {
        this.atmsAmount = atmsAmount;
    }

    public int getEmployeesAmount() {
        return employeesAmount;
    }

    public void setEmployeesAmount(int employeesAmount) {
        this.employeesAmount = employeesAmount;
    }

    public int getClientsAmount() {
        return clientsAmount;
    }

    public void setClientsAmount(int clientsAmount) {
        this.clientsAmount = clientsAmount;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
