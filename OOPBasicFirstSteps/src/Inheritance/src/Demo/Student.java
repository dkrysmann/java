package Demo;


public class Student extends Person{
    private String education;

    public Student(String name, int age,String education) {
        super(name, age);
        this.education = education;
    }

    private String getEducation() {
        return this.education;
    }

    @Override
    public void printInformation(){
        super.printInformation();
        System.out.printf("Education - %s",this.getEducation());
    }
}
