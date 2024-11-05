package tech.reliab.course.tutovda.bank.entity;

import java.time.LocalDate;

public class User extends Person {
    private String workPlace = "-";
    private int monthlyIncome = (int) (1 + Math.random() * 10000);
    private Bank bank;
    private PaymentAccount paymentAccount = null;
    private CreditAccount creditAccount = null;
    private int creditRating = (int) (1 + Math.random() * 1000);

    public User() {}

    public User(int id, String name, LocalDate birthdayDate, String workPlace, int monthlyIncome, Bank bank,
                PaymentAccount paymentAccount, CreditAccount creditAccount, int creditRating) {
        super(id, name, birthdayDate);
        this.workPlace = workPlace;
        this.monthlyIncome = monthlyIncome;
        this.bank = bank;
        this.paymentAccount = paymentAccount;
        this.creditAccount = creditAccount;
        this.creditRating = creditRating;
    }

    public User(int id, String name, LocalDate birthdayDate, String workPlace,
                int monthlyIncome, Bank bank, int creditRating) {
        super(id, name, birthdayDate);
        this.workPlace = workPlace;
        this.monthlyIncome = monthlyIncome;
        this.bank = bank;
        this.creditRating = creditRating;
    }

    public User(User user) {
        super(user.id, user.name, user.birthdayDate);
        user.workPlace = workPlace;
        user.monthlyIncome = monthlyIncome;
        user.bank = bank;
        user.paymentAccount = paymentAccount;
        user.creditAccount = creditAccount;
        user.creditRating = creditRating;
    }

    public String toString() {
        return "*** User Info ***\n" +
                super.toString() + '\n' +
                "work place -> " + workPlace + '\n' +
                "monthly income -> " + monthlyIncome + '\n' +
                "bank -> " + bank + '\n' +
                "payment account -> " + paymentAccount + '\n' +
                "credit account -> " + creditAccount + '\n' +
                "credit rating -> " + creditRating + '\n' +
                "*** ********* ***";
    }

    // ============== getters & setters ==============
    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }
}
