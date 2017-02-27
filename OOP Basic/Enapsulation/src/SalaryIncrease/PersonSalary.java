package SalaryIncrease;


public class PersonSalary {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public PersonSalary(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstName(){
        return this.firstName;
    }
    private String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }
    private void setLastName(String lastName){
        this.lastName = lastName;
    }
    private void setAge(int age){
        this.age = age;
    }
    private void setSalary(double salary){
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if(this.getAge() > 30){
            this.salary += this.salary * bonus/100;
        }else{
            this.salary += this.salary * bonus / 200;
        }
    }
    public void printSalary(){
        System.out.printf("%s %s get %s leva%n",this.getFirstName(),this.getLastName(),this.getSalary());
    }

  //  @Override
  //  public String toString() {
  //      return this.getFirstName() + " " + this.getLastName() + " " + "get " + this.getSalary()
  //              + " leva";
  //  }
}
