package tech.reliab.course.tutovda.bank.service;

import tech.reliab.course.tutovda.bank.entity.BankAtm;
import tech.reliab.course.tutovda.bank.entity.BankOffice;
import tech.reliab.course.tutovda.bank.entity.Employee;

public interface BankOfficeService {
    BankOffice create(BankOffice bankOffice);

    boolean installAtm(BankOffice bankOffice, BankAtm bankAtm);

    boolean removeAtm(BankOffice bankOffice, BankAtm bankAtm);

    boolean inputMoney(BankOffice bankOffice, int money);

    boolean outputMoney(BankOffice bankOffice, int money);

    boolean addEmployee(BankOffice bankOffice, Employee employee);

    boolean removeEmployee(BankOffice bankOffice, Employee employee);
}
