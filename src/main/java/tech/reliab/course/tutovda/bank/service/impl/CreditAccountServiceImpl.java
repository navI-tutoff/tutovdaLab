package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.CreditAccount;
import tech.reliab.course.tutovda.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {
    public CreditAccount create(CreditAccount creditAccount) {
        if (creditAccount == null) {
            return null;
        }

        if (creditAccount.getMonthsAmount() < 1) {
            System.err.println("[ERROR] | CreditAccount - monthCount must be at least 1");
            return null;
        }

        if (creditAccount.getCreditSum() <= 0) {
            System.err.println("[ERROR] | CreditAccount - creditAmount must be positive");
            return null;
        }

        if (creditAccount.getBank() == null) {
            System.err.println("[ERROR] | CreditAccount - no bank");
            return null;
        }

        return new CreditAccount(creditAccount);
    }

    public boolean doMonthlyPayment(CreditAccount creditAccount) {
        if (creditAccount == null || creditAccount.getPaymentAccount() == null) {
            System.err.println("[ERROR] | CreditAccount - no account to take money from");
            return false;
        }

        final int monthlyPayment = creditAccount.getMonthlyPayment();
        final int paymentAccountBalance = creditAccount.getPaymentAccount().getBalance();

        if (paymentAccountBalance - monthlyPayment < 0) {
            System.err.println("[ERROR] | CreditAccount - not enough balance for monthly payment");
            return false;
        }

        creditAccount.getPaymentAccount().setBalance(paymentAccountBalance - monthlyPayment);
        creditAccount.setCreditSum(creditAccount.getCreditSum() - monthlyPayment);

        return true;
    }
}
