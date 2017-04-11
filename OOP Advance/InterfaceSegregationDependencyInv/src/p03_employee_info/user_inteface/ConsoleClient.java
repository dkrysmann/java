package p03_employee_info.user_inteface;

public class ConsoleClient {
    private Formatter formatter;
    private InfoProvider provider;

    public ConsoleClient(Formatter formatter,InfoProvider provider){
        this.formatter = formatter;
        this.provider = provider;
    }
    public String printResult(){
        return this.formatter.format(this.provider.getEmployeeBy((e1,e2) -> e1.getName().compareTo(e2.getName())));
    }

}
