package EmployeeInfo.user_interfaces;


import EmployeeInfo.models.Employee;

import java.util.Comparator;
import java.util.List;

public interface InfoProvider {
    List<Employee> getEmployeesBy(Comparator<Employee> comparator);
}
