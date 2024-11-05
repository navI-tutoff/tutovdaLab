package tech.reliab.course.tutovda.bank.entity;

import java.time.LocalDate;

public class Employee extends Person {
    private String jobTitle = "-";
    private Bank bank = null;
    private boolean isRemoteWork = false;
    private BankOffice bankOffice = null;
    private boolean isGiveCreditAvailable = false;
    private int salary = 0;

    public Employee() {}

    public Employee(Employee employee) {
        super(employee.id, employee.name, employee.birthdayDate);
        jobTitle = employee.jobTitle;
        bank = new Bank(employee.bank);
        isRemoteWork = employee.isRemoteWork;
        bankOffice = new BankOffice(employee.bankOffice);
        isGiveCreditAvailable = employee.isGiveCreditAvailable;
        salary = employee.salary;
    }

    public Employee(int id, String name, LocalDate birthdayDate, String jobTitle, Bank bank,
                    boolean isRemoteWork, BankOffice bankOffice, boolean isGiveCreditAvailable, int salary) {
        super(id, name, birthdayDate);
        this.jobTitle = jobTitle;
        this.bank = bank;
        this.isRemoteWork = isRemoteWork;
        this.bankOffice = bankOffice;
        this.isGiveCreditAvailable = isGiveCreditAvailable;
        this.salary = salary;
    }

    public String toString() {
        return "*** Employee Info ***\n" +
                super.toString() + '\n' +
                "job title -> " + jobTitle + '\n' +
                "bank -> " + bank + '\n' +
                "remote work -> " + isRemoteWork + '\n' +
                "bank office -> " + bankOffice + '\n' +
                "give credit available -> " + isGiveCreditAvailable + '\n' +
                "salary -> " + salary + '\n' +
                "*** ************* ***";
    }

    // ============== getters & setters ==============
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean isRemoteWork() {
        return isRemoteWork;
    }

    public void setRemoteWork(boolean remoteWork) {
        isRemoteWork = remoteWork;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public boolean isGiveCreditAvailable() {
        return isGiveCreditAvailable;
    }

    public void setGiveCreditAvailable(boolean giveCreditAvailable) {
        isGiveCreditAvailable = giveCreditAvailable;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
