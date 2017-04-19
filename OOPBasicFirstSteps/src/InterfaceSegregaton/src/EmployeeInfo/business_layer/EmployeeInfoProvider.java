package EmployeeInfo.business_layer;

import EmployeeInfo.models.Employee;
import EmployeeInfo.database_layer.EmployeeDatabase;
import EmployeeInfo.user_interfaces.InfoProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider{

    private EmployeeDatabase database;

    public EmployeeInfoProvider() {
        this.database = new EmployeeDatabase();
    }

    @Override
    public List<Employee> getEmployeesBy(Comparator<Employee> comparator) {
        return this.database.readEmployees().stream().sorted().collect(Collectors.toList());

    }
}
