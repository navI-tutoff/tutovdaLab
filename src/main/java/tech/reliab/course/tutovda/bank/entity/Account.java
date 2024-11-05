package tech.reliab.course.tutovda.bank.entity;

public class Account {
    protected int id = (int) (1 + Math.random() * 10000);
    protected User user = null;
    protected Bank bank = null;

    public Account() {}

    public Account(Account account) {
        id = account.id;
        user = new User(account.user);
        bank = new Bank(account.bank);
    }

    public Account(User user, Bank bank) {
        this.user = user;
        this.bank = bank;
    }

    public Account(int id, User user, Bank bank) {
        this.id = id;
        this.user = user;
        this.bank = bank;
    }

    public String toString() {
        return "*** Account Info ***\n" +
                "id -> " + id + '\n' +
                "user -> " + user + '\n' +
                "bank -> " + bank + '\n' +
                "*** ************ ***";
    }

    // ============== getters & setters ==============
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
