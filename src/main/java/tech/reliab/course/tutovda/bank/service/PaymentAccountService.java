package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    PaymentAccount create(PaymentAccount paymentAccount);

    boolean inputMoney(PaymentAccount paymentAccount, int money);

    boolean outputMoney(PaymentAccount paymentAccount, int money);
}
