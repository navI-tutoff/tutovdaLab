package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.User;
import tech.reliab.course.tutovda.bank.service.UserService;

import java.util.Random;

public class UserServiceImpl implements UserService {
    public User create(User user) {
        if (user == null) {
            return null;
        }

        if (user.getBank() == null) {
            System.err.println("Error: Client - must have bank");
            return null;
        }

        User user1 = new User(user);

        Random random = new Random();
        final int monthlyIncome = random.nextInt() * 10000;
        user1.setMonthlyIncome(monthlyIncome);
        calculateCreditRating(user1);

        return user1;
    }

    public int calculateCreditRating(User user) {
        user.setCreditRating(user.getMonthlyIncome() / 10);
        return user.getCreditRating();
    }

}
