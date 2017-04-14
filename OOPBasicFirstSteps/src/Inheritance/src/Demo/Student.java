package Demo;


public class Student extends Person{
    private String education;

    public Student(String name, int age,String education) {
        super(name, age);
        this.education = education;
    }

}
