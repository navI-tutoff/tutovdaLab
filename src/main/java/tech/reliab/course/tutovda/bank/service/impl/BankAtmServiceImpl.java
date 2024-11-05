package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.Bank;
import tech.reliab.course.tutovda.bank.entity.BankAtm;
import tech.reliab.course.tutovda.bank.service.BankAtmService;

public class BankAtmServiceImpl implements BankAtmService {
    public BankAtm create(BankAtm bankAtm) {
        if (bankAtm == null) {
            return null;
        }
        if (bankAtm.getTotalMoney() < 0) {
            System.err.println("[ERROR] Can not create BankAtm - totalMoney must be non-negative");
            return null;
        }
        if (bankAtm.getMaintenancePrice() < 0) {
            System.err.println("[ERROR] Can not create BankAtm - maintenancePrice must be non-negative");
            return null;
        }
        if (bankAtm.getBankOffice() == null) {
            System.err.println("[ERROR] Can not create BankAtm - bankOffice can not be null");
            return null;
        }
        return new BankAtm(bankAtm);
    }

    public boolean inputMoney(BankAtm bankAtm, int money) {
        if (bankAtm == null) {
            System.err.println("[ERROR] BankAtm can not deposit money - non existing ATM");
            return false;
        }
        if (money <= 0) {
            System.err.println("[ERROR] BankAtm can not deposit money - amount is not positive");
            return false;
        }
        if (!bankAtm.isCashOutputAvailable()) {
            System.err.println("[ERROR] BankAtm can not deposit money - deposit is not allowed");
            return false;
        }
        bankAtm.setTotalMoney(bankAtm.getTotalMoney() + money);
        return true;
    }

    public boolean outputMoney(BankAtm bankAtm, int money) {
        if (bankAtm == null) {
            System.err.println("[ERROR] BankAtm can not withdraw money - non existing ATM");
            return false;
        }
        if (money <= 0) {
            System.err.println("[ERROR] BankAtm can not withdraw money - amount is not positive");
            return false;
        }
        if (!bankAtm.isCashOutputAvailable()) {
            System.err.println("[ERROR] BankAtm can not withdraw money - deposit is not allowed");
            return false;
        }
        if (bankAtm.getTotalMoney() - money < 0) {
            System.err.println("[ERROR] BankAtm can not withdraw money - ATM does not have enough money");
            return false;
        }
        bankAtm.setTotalMoney(bankAtm.getTotalMoney() - money);
        return true;
    }
}
