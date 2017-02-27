package ValidationData;


public class PersonValidationData {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public PersonValidationData(String firstName,String lastName,int age,double salary){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }
    private String getFirstName(){
        return this.firstName;
    }
    private void setFirstName(String firstName){
        if(firstName.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }
    private String getLastName(){
        return this.lastName;
    }
    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }
    private int getAge(){
        return this.age;
    }
    private void setAge(int age){
        if( age < 1){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }
    private double getSalary(){
        return this.salary;
    }
    private void setSalary(double salary){
        if(salary < 460.0){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }
    public void increaseSalary(double bonus) {
        if(this.getAge() > 30){
            this.salary += this.getSalary() * bonus / 100;
        }else{
            this.salary += this.getSalary() * bonus / 200;
        }
    }

    public void printResult(){
        System.out.printf("%s %s get %s leva%n",this.getFirstName(),this.getLastName(),this.getAge(),this.getSalary());
    }
}
