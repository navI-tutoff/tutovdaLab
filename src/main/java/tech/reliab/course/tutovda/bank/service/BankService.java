package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.*;

public interface BankService {
    // create bank
    Bank create(Bank bank);

    // add office
    boolean addOffice(Bank bank, BankOffice bankOffice);

    // delete office from bank
    boolean deleteOffice(Bank bank, BankOffice bankOffice);

    // add atm
    boolean addAtm(Bank bank, BankAtm bankAtm);

    // delete atm from bank
    boolean deleteAtm(Bank bank, BankAtm bankAtm);

    // add employee
    boolean addEmployee(Bank bank, Employee employee);

    // delete employee
    boolean deleteEmployee(Bank bank, Employee employee);

    // add user
    boolean addUser(Bank bank, User user);

    // delete user from bank
    boolean deleteUser(Bank bank, User user);

    // calculate interest rate
    double calculateInterestRate(Bank bank);

    // input money
    boolean inputMoney(Bank bank, int money);

    // output money
    boolean outputMoney(Bank bank, int money);
}
