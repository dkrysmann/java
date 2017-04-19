package EmployeeInfo;

import EmployeeInfo.business_layer.ConsoleFormatter;
import EmployeeInfo.business_layer.EmployeeInfoProvider;
import EmployeeInfo.user_interfaces.ConsoleClient;

public class Main {

    public static void main(String[] args) {
        EmployeeInfoProvider employeeInfo = new EmployeeInfoProvider();
        ConsoleFormatter formatter = new ConsoleFormatter();
        ConsoleClient consoleClient = new ConsoleClient(formatter,employeeInfo);
        System.out.println(consoleClient.getResult());
    }
}
