package HospitalEmployees;


  public abstract class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id,String name,String department,boolean working){
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public boolean isWorking() {
        return this.working;
    }
    protected abstract void perferfomDuties();

    @Override
    public String toString() {
       return String.format("Id - %s%nName - %s%nDepartment - %s%nWorking - %b",this.getId(),this.getName(),this.getDepartment()
       ,this.isWorking());
    }
}
