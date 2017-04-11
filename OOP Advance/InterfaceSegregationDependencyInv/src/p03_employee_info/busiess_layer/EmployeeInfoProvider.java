package p03_employee_info.busiess_layer;

import p03_employee_info.models.Employee;
import p03_employee_info.database_layer.EmployeeDatabase;
import p03_employee_info.user_inteface.InfoProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider{

    private EmployeeDatabase database;

    public EmployeeInfoProvider() {
        this.database = new EmployeeDatabase();
    }


    @Override
    public List<Employee> getEmployeeBy(Comparator<Employee> employeeComparator) {
        return this.database.readEmployees().stream().sorted(employeeComparator).collect(Collectors.toList());
    }
}
