package tech.reliab.course.tutovda.bank.entity;

public class PaymentAccount extends Account {
    private int balance = 0;

    public PaymentAccount() {}

    public PaymentAccount(int id, User user, Bank bank, int balance) {
        super(id, user, bank);
        this.balance = balance;
    }

    public PaymentAccount(PaymentAccount paymentAccount) {
        super(paymentAccount.id, paymentAccount.user, paymentAccount.bank);
        balance = paymentAccount.balance;
    }

    @Override
    public String toString() {
        return "*** Payment Account Info ***\n" +
                super.toString() + '\n' +
                "balance -> " + balance + '\n' +
                "*** ******************** ***";
    }

    // ============== getters & setters ==============
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
