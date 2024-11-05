package tech.reliab.course.tutovda.bank.entity;

import java.time.LocalDate;

public class CreditAccount extends Account {
    private LocalDate dateStart = null;
    private LocalDate dateEnd = null;
    private int monthsAmount = 0;
    private int creditSum = 0;
    private int monthlyPayment = 0;
    private int interestRate = 0;
    private Employee employee = null;
    private PaymentAccount paymentAccount = null;

    public CreditAccount() {}

    public CreditAccount(CreditAccount creditAccount) {
        super(creditAccount.id, creditAccount.user, creditAccount.bank);
        dateStart = creditAccount.dateStart;
        dateEnd = creditAccount.dateEnd;
        monthsAmount = creditAccount.monthsAmount;
        creditSum = creditAccount.creditSum;
        monthlyPayment = creditAccount.monthlyPayment;
        interestRate = creditAccount.interestRate;
        employee = new Employee(creditAccount.employee);
        paymentAccount = new PaymentAccount(creditAccount.paymentAccount);
    }

    public CreditAccount(int id, User user, Bank bank, LocalDate dateStart, LocalDate dateEnd,
                         int monthAmount, int creditSum, int monthlyPayment, int interestRate,
                         Employee employee, PaymentAccount paymentAccount) {
        super(id, user, bank);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.monthsAmount = monthAmount;
        this.creditSum = creditSum;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    public String toString() {
        return "*** Credit Account Info ***\n" +
                super.toString() + '\n' +
                "start date -> " + dateStart + '\n' +
                "end date -> " + dateEnd + '\n' +
                "months amount -> " + monthsAmount + '\n' +
                "credit sum -> " + creditSum + '\n' +
                "monthly payment -> " + monthlyPayment + '\n' +
                "interest rate -> " + interestRate + '\n' +
                "employee -> " + employee + '\n' +
                "payment account -> " + paymentAccount + '\n' +
                "*** ******************* ***";
    }

    // ============== getters & setters ==============
    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getMonthsAmount() {
        return monthsAmount;
    }

    public void setMonthsAmount(int monthsAmount) {
        this.monthsAmount = monthsAmount;
    }

    public int getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(int creditSum) {
        this.creditSum = creditSum;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }
}
