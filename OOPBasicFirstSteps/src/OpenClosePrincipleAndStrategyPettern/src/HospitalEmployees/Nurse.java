package HospitalEmployees;


public class Nurse extends Employee{
    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action");
    }

    @Override
    protected void perferfomDuties() {
        checkVitalSigns();
        drawBlood();
        cleaningPatientArea();
    }
    //Nurse
    private void checkVitalSigns(){
        System.out.println("checking vitals");
    }
    private void drawBlood(){
        System.out.println("drawing blood");
    }
    private void cleaningPatientArea(){
        System.out.println("cleaning Patient Area");
    }
}
