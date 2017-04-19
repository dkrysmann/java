package EmployeeInfo.business_layer;

import EmployeeInfo.models.Employee;
import EmployeeInfo.user_interfaces.Formatter;

public class ConsoleFormatter implements Formatter{

    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
