package EmployeeInfo.business_layer;


import EmployeeInfo.models.Employee;

import java.util.List;

public interface Database {
    List<Employee> readEmployees();
}
