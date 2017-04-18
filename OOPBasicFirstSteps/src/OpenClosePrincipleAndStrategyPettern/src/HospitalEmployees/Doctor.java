package HospitalEmployees;


public class Doctor extends Employee {
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action");
    }

    @Override
    protected void perferfomDuties() {
        prescribeMedicine();
        diagnosePatients();
    }

    //Doctor
    private void prescribeMedicine(){
        System.out.println("Prescribe medicine");
    }
    private void diagnosePatients(){
        System.out.println("diagnosing patients");
    }
}
