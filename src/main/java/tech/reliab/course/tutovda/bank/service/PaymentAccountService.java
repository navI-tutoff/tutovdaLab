package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.PaymentAccount;
import java.util.List;

public interface PaymentAccountService {
    PaymentAccount create(PaymentAccount paymentAccount);

    PaymentAccount getPaymentAccountById(int id);

    List<PaymentAccount> getAllPaymentAccounts();

    boolean inputMoney(int id, int money);

    boolean outputMoney(int id, int money);
}
