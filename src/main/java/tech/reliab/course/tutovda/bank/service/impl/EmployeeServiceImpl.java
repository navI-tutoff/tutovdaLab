package tech.reliab.course.tutovda.bank.service.impl;

import tech.reliab.course.tutovda.bank.entity.Employee;
import tech.reliab.course.tutovda.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    public Employee create(Employee employee) {
        if (employee == null) {
            return null;
        }

        if (employee.getSalary() < 0) {
            System.err.println("[ERROR] | Employee -> salary must be non-negative");
            return null;
        }

        return new Employee(employee);
    }
}
