package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.BankAtm;
import tech.reliab.course.tutovda.bank.entity.BankOffice;
import tech.reliab.course.tutovda.bank.entity.Employee;
import tech.reliab.course.tutovda.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {
    public BankOffice create(BankOffice bankOffice) {
        if (bankOffice == null) {
            return null;
        }

        if (bankOffice.getTotalMoney() < 0) {
            System.err.println("[ERROR] | BankOffice -> total money must be non-negative");
            return null;
        }

        if (bankOffice.getBank() == null) {
            System.err.println("[ERROR] | BankOffice -> must have bank");
            return null;
        }

        if (bankOffice.getRentPrice() < 0) {
            System.err.println("[ERROR] | BankOffice -> rentPrice must be non-negative");
            return null;
        }

        return new BankOffice(bankOffice);
    }

    public boolean inputMoney(BankOffice bankOffice, int money) {
        if (bankOffice == null) {
            System.err.println("[ERROR] | BankOffice -> can not deposit money to not existing office");
            return false;
        }

        if (money <= 0) {
            System.err.println("[ERROR] | BankOffice -> can not deposit money -> deposit amount must be positive");
            return false;
        }

        if (!bankOffice.isCashOutputAvailable()) {
            System.err.println("[ERROR] | BankOffice -> can not deposit money -> office can not accept deposit");
            return false;
        }

        bankOffice.setTotalMoney(bankOffice.getTotalMoney() + money);
        return true;
    }

    public boolean outputMoney(BankOffice bankOffice, int money) {
        if (bankOffice == null) {
            System.err.println("[ERROR] | BankOffice -> can not withdraw money from not existing office");
            return false;
        }

        if (money <= 0) {
            System.err.println("[ERROR] | BankOffice -> can not withdraw money -> withdraw amount must be positive");
            return false;
        }

        if (!bankOffice.isCashOutputAvailable()) {
            System.err.println("[ERROR] | BankOffice -> can not withdraw money -> office can not give withdrawal");
            return false;
        }

        if (bankOffice.getTotalMoney() - money < 0) {
            System.err.println("[ERROR] | BankOffice -> can not withdraw money -> office does not have enough money");
            return false;
        }

        bankOffice.setTotalMoney(bankOffice.getTotalMoney() - money);
        return true;
    }

    public boolean installAtm(BankOffice bankOffice, BankAtm bankAtm) {
        if (bankOffice != null && bankAtm != null) {
            if (!bankOffice.isAtmPlaceable()) {
                System.err.println("[ERROR] | BankOffice -> can not install atm");
                return false;
            }

            bankOffice.setAtmsAmount(bankOffice.getAtmsAmount() + 1);
            bankAtm.setBankOffice(bankOffice);
            bankAtm.setAddress(bankOffice.getAddress());
            return true;
        }
        return false;
    }

    public boolean removeAtm(BankOffice bankOffice, BankAtm bankAtm) {
        if (bankOffice != null && bankAtm != null) {
            final int newAtmCountOffice = bankOffice.getAtmsAmount() - 1;
            if (newAtmCountOffice < 0) {
                System.err.println("[ERROR] | BankOffice -> can not remove ATM, no ATMs");
                return false;
            }

            bankOffice.setAtmsAmount(newAtmCountOffice);
            return true;
        }
        return false;
    }

    public boolean addEmployee(BankOffice bankOffice, Employee employee) {
        if (bankOffice != null && employee != null) {
            employee.setBankOffice(bankOffice);
            employee.setBank(bankOffice.getBank());
            return true;
        }
        return false;
    }

    public boolean removeEmployee(BankOffice bankOffice, Employee employee) {
        return bankOffice != null && employee != null;
    }
}
