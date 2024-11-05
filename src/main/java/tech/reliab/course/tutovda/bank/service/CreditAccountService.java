package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.CreditAccount;

public interface CreditAccountService {
    CreditAccount create(CreditAccount creditAccount);

    boolean doMonthlyPayment(CreditAccount creditAccount);
}
