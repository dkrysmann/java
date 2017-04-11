package p03_employee_info.user_inteface;


import p03_employee_info.models.Employee;

import java.util.Comparator;
import java.util.List;

public interface InfoProvider {
    List<Employee> getEmployeeBy(Comparator<Employee> employeeComparator);
}
