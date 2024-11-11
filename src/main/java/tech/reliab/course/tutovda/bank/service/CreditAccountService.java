package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.CreditAccount;

import java.util.List;

public interface CreditAccountService {
    CreditAccount create(CreditAccount creditAccount);

    CreditAccount getCreditAccountById(int id);

    List<CreditAccount> getAllCreditAccounts();

    boolean doMonthlyPayment(int id);
}
