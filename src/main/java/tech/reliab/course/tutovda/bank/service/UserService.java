package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.User;

public interface UserService {
    User create(User user);

    int calculateCreditRating(User user);
}
