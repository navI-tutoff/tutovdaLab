package tech.reliab.course.tutovda.bank.entity;



public class Bank {
    public final double MAX_INTEREST_RATE = 20.0;
    public final int MAX_BANK_RATING = 100;

    private int id = (int) (1 + Math.random() * 10000);
    private String name = "-";
    private int officesAmount = 0;
    private int atmsAmount = 0;
    private int employeesAmount = 0;
    private int clientsAmount = 0;
    private byte rating = (byte) (1 + Math.random() * 100);
    private long totalMoney = 0;
    private double interestRate = 0;

    public Bank() {}

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

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Bank(String name) {
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(byte interestRate) {
        this.interestRate = interestRate;
    }
}
