package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.CreditAccount;
import tech.reliab.course.tutovda.bank.entity.PaymentAccount;
import tech.reliab.course.tutovda.bank.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User getUserById(int id);

    List<User> getAllUsers();

    boolean addPaymentAccount(int id, PaymentAccount account);

    boolean addCreditAccount(int id, CreditAccount account);

    List<PaymentAccount> getAllPaymentAccountsByUserId(int id);

    List<CreditAccount> getAllCreditAccountsByUserId(int id);

    int calculateCreditRating(User user);
}
