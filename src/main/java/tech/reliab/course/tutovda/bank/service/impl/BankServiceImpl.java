package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.*;
import tech.reliab.course.tutovda.bank.service.BankService;

import java.util.Random;

public class BankServiceImpl implements BankService {
    public Bank create(Bank bank) {
        if (bank == null) {
            return null;
        }

        Bank createdBank = new Bank(bank.getId(), bank.getName());

        createdBank.setRating((byte) (1 + Math.random() * 100));
        createdBank.setTotalMoney((byte) (1 + Math.random() * 1000000));
        calculateInterestRate(createdBank);

        return createdBank;
    }

    public boolean addOffice(Bank bank, BankOffice bankOffice) {
        if (bank != null && bankOffice != null) {
            bankOffice.setBank(bank);
            bank.setOfficesAmount(bank.getOfficesAmount() + 1);
            return true;
        }
        return false;
    }

    public boolean deleteOffice(Bank bank, BankOffice bankOffice) {
        if (bank != null && bankOffice != null) {
            if (bank.getOfficesAmount() - 1 < 0) {
                System.err.println("[ERROR] Bank " + bank.getName() + " | Can't delete office. Already zero");
                return false;
            }

            bank.setOfficesAmount(bank.getOfficesAmount() - 1);
            return true;
        }
        return false;
    }

    public boolean addAtm(Bank bank, BankAtm bankAtm) {
        if (bank != null && bankAtm != null) {
            bankAtm.setBank(bank);
            bank.setAtmsAmount(bank.getAtmsAmount() + 1);
            return true;
        }
        return false;
    }

    public boolean deleteAtm(Bank bank, BankAtm bankAtm) {
        if (bank != null && bankAtm != null) {
            if (bank.getAtmsAmount() - 1 < 0) {
                System.err.println("[ERROR] Bank " + bank.getName() + " | Can't delete atm. Already zero");
                return false;
            }

            bank.setAtmsAmount(bank.getAtmsAmount() - 1);
            return true;
        }
        return false;
    }

    public boolean addEmployee(Bank bank, Employee employee) {
        if (bank != null && employee != null) {
            employee.setBank(bank);
            bank.setEmployeesAmount(bank.getEmployeesAmount() + 1);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(Bank bank, Employee employee) {
        if (bank != null && employee != null) {
            if (bank.getEmployeesAmount() - 1 < 0) {
                System.err.println("[ERROR] Bank " + bank.getName() + " | Can't delete employee. Already zero");
                return false;
            }

            bank.setEmployeesAmount(bank.getEmployeesAmount() - 1);
            return true;
        }
        return false;
    }

    public boolean addUser(Bank bank, User user) {
        if (bank != null && user != null) {
            user.setBank(bank);
            bank.setClientsAmount(bank.getClientsAmount() + 1);
            return true;
        }
        return false;
    }

    public boolean deleteUser(Bank bank, User user) {
        if (bank != null && user != null) {
            if (bank.getClientsAmount() - 1 < 0) {
                System.err.println("[ERROR] Bank " + bank.getName() + " | Can't delete clients. Already zero");
                return false;
            }

            bank.setClientsAmount(bank.getClientsAmount() - 1);
            return true;
        }
        return false;
    }

    public double calculateInterestRate(Bank bank) {
        if (bank != null) {
            double reductionFactor = (bank.MAX_BANK_RATING - bank.getRating() + 1) / (double) bank.MAX_BANK_RATING;

            Random random = new Random();
            double baseRate = random.nextDouble() * bank.MAX_INTEREST_RATE;
            double interestRate = baseRate * reductionFactor;

            return Math.round(interestRate * 100.0) / 100.0;

        }

        return 0.0;
    }

    public boolean inputMoney(Bank bank, int money) {
        if (bank == null) {
            System.err.println("[ERROR] Bank | Can not deposit money to uninitialized bank");
            return false;
        }

        if (money <= 0) {
            System.err.println("[ERROR] Bank | Can not deposit money. Deposit amount must be positive");
            return false;
        }

        bank.setTotalMoney(bank.getTotalMoney() + money);
        return true;
    }

    public boolean outputMoney(Bank bank, int money) {
        if (bank == null) {
            System.err.println("[ERROR] Bank | Can not withdraw money from uninitialized bank");
            return false;
        }

        if (money <= 0) {
            System.err.println("[ERROR] Bank | Can not withdraw money. Withdraw amount must be positive");
            return false;
        }

        if (bank.getTotalMoney() - money < 0) {
            System.err.println("[ERROR] Bank | Can not withdraw money. Bank does not have enough money");
            return false;
        }

        bank.setTotalMoney(bank.getTotalMoney() - money);
        return true;
    }

}
