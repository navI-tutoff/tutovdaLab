package tech.reliab.course.tutovda.bank.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class Account {
    protected int id = (int) (1 + Math.random() * 10000);
    protected User user = null;
    protected Bank bank = null;

    public Account(Account account) {
        id = account.id;
        user = new User(account.user);
        bank = new Bank(account.bank);
    }

    public Account(User user, Bank bank) {
        this.user = user;
        this.bank = bank;
    }
}
