package p03_employee_info;

import p03_employee_info.busiess_layer.ConsoleFormatter;
import p03_employee_info.busiess_layer.EmployeeInfoProvider;
import p03_employee_info.user_inteface.ConsoleClient;
import p03_employee_info.user_inteface.Formatter;
import p03_employee_info.user_inteface.InfoProvider;

public class Main {

    public static void main(String[] args) {
        InfoProvider employeeInfo = new EmployeeInfoProvider();
        Formatter formatter = new ConsoleFormatter();
        ConsoleClient client = new ConsoleClient(formatter,employeeInfo);
        System.out.println(client.printResult());
    }
}
