package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.PaymentAccount;
import tech.reliab.course.tutovda.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    public PaymentAccount create(PaymentAccount paymentAccount) {
        if (paymentAccount == null) {
            return null;
        }

        if (paymentAccount.getBalance() < 0) {
            System.err.println("[ERROR] | PaymentAccount -> payment account balance must be non-negative");
            return null;
        }

        return new PaymentAccount(paymentAccount);
    }

    public boolean inputMoney(PaymentAccount paymentAccount, int money) {
        if (paymentAccount == null) {
            System.err.println("[ERROR] | PaymentAccount -> non existing payment account");
            return false;
        }

        if (money <= 0) {
            System.err.println("[ERROR] | PaymentAccount -> deposit amount must be positive");
            return false;
        }

        paymentAccount.setBalance(paymentAccount.getBalance() + money);
        return true;
    }

    public boolean outputMoney(PaymentAccount paymentAccount, int money) {
        if (paymentAccount == null) {
            System.err.println("[ERROR] | PaymentAccount -> non existing payment account");
            return false;
        }

        if (money <= 0) {
            System.err
                    .println("[ERROR] | PaymentAccount -> withdrawal amount must be positive");
            return false;
        }

        if (paymentAccount.getBalance() - money < 0) {
            System.err.println("[ERROR] |PaymentAccount -> not enough money");
            return false;
        }

        paymentAccount.setBalance(paymentAccount.getBalance() - money);
        return true;
    }
}
