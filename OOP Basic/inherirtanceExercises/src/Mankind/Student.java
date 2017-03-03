package Mankind;


public class Student extends Human{
    private String facultyNumber;
    public Student(String name,String lastName,String facultyNumber){
        super(name, lastName);
        this.setFacultyNumber(facultyNumber);
    }
    private String getFacultyNumber(){
        return this.facultyNumber;
    }
    private void setFacultyNumber(String facultyNumber){
        if(facultyNumber.length() < 5 || facultyNumber.length() > 10){
            String error = "Invalid faculty number!";
            throw new IllegalArgumentException(error);
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty number: " + this.getFacultyNumber();
    }
}
