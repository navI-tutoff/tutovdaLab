package tech.reliab.course.tutovda.bank;

import tech.reliab.course.tutovda.bank.entity.Bank;
import tech.reliab.course.tutovda.bank.entity.BankAtm;
import tech.reliab.course.tutovda.bank.entity.BankOffice;
import tech.reliab.course.tutovda.bank.entity.User;
import tech.reliab.course.tutovda.bank.entity.CreditAccount;
import tech.reliab.course.tutovda.bank.entity.Employee;
import tech.reliab.course.tutovda.bank.entity.PaymentAccount;
import tech.reliab.course.tutovda.bank.service.BankAtmService;
import tech.reliab.course.tutovda.bank.service.BankOfficeService;
import tech.reliab.course.tutovda.bank.service.BankService;
import tech.reliab.course.tutovda.bank.service.CreditAccountService;
import tech.reliab.course.tutovda.bank.service.EmployeeService;
import tech.reliab.course.tutovda.bank.service.UserService;
import tech.reliab.course.tutovda.bank.service.PaymentAccountService;
import tech.reliab.course.tutovda.bank.service.impl.BankAtmServiceImpl;
import tech.reliab.course.tutovda.bank.service.impl.BankOfficeServiceImpl;
import tech.reliab.course.tutovda.bank.service.impl.BankServiceImpl;
import tech.reliab.course.tutovda.bank.service.impl.CreditAccountServiceImpl;
import tech.reliab.course.tutovda.bank.service.impl.EmployeeServiceImpl;
import tech.reliab.course.tutovda.bank.service.impl.PaymentAccountServiceImpl;
import tech.reliab.course.tutovda.bank.service.impl.UserServiceImpl;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();
        Bank bank = bankService.create(new Bank("Ultra mega blatnoy bank"));
        System.out.println(bank);

        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        BankOffice bankOffice = bankOfficeService.create(new BankOffice(
                1337,
                "Office of blatnoy bank",
                "street Pushkina, house Kolotyshkina",
                bank,
                true,
                true,
                0,
                true,
                true,
                true,
                bank.getTotalMoney(),
                123
                ));
        System.out.println(bankOffice);

        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.create(new Employee(
                1,
                "Ruslan Polivaniy",
                LocalDate.of(2003, 12, 9),
                "Cleaner",
                bank,
                false,
                bankOffice,
                false,
                7000
        ));
        System.out.println(employee);

        BankAtmService bankAtmService = new BankAtmServiceImpl();
        BankAtm bankAtm = bankAtmService.create(new BankAtm(
                1,
                "Super ATM of Blatnoy bank",
                bankOffice.getAddress(),
                BankAtm.Status.WORKING,
                bank,
                bankOffice,
                employee,
                true,
                true,
                0,
                17));
        System.out.println(bankAtm);

        UserService userService = new UserServiceImpl();
        User user = userService.create(new User(
                42,
                "Alexey Starodybov",
                LocalDate.of(2003, 7, 29),
                "Golugolu",
                6875321,
                bank,
                3
        ));

        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        PaymentAccount paymentAccount = paymentAccountService.create(new PaymentAccount(1, user, bank, 8975));
        System.out.println(paymentAccount);

        CreditAccountService creditAccountService = new CreditAccountServiceImpl();
        CreditAccount creditAccount = creditAccountService.create(new CreditAccount(
                1,
                user,
                bank,
                LocalDate.of(1999, 1, 1),
                LocalDate.of(1999, 2, 1),
                1,
                16000,
                50,
                3,
                employee,
                paymentAccount));
        System.out.println(creditAccount);
    }
}