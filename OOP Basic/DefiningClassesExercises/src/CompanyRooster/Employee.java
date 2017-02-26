package CompanyRooster;


public class Employee extends Person {

    private double salary;
    private String position;
    private String department;
    private String email;
    

    public Employee(String name,double salary,String position,String department,String email,int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }
    public Employee(String name,double salary,String position,String department,int age,String email){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }
    public Employee(int age,String name,double salary,String position,String department,String email){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }
    public Employee(String email,int age,String position,String name,String department,double salary){
        this.email = email;
        this.age = age;
        this.position = position;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
