package Demo;


public class Student extends Person {
    private String town;
    public Student(String name,int age,String town){
        super(name,age);
        this.town = town;
    }
    public void getTown(){
        System.out.printf(" From %s",this.town);
    }
}
