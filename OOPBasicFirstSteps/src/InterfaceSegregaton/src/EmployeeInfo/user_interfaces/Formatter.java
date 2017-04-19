package EmployeeInfo.user_interfaces;


import EmployeeInfo.models.Employee;

public interface Formatter {
    String format(Iterable<Employee> employees);
}
