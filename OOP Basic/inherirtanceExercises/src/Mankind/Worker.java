package Mankind;


import java.text.DecimalFormat;

public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String name,String lastName,double weekSalary,double workHoursPerDay){
        super(name, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }
    private double getWeekSalary(){
        return this.weekSalary;
    }
    private void setWeekSalary(double weekSalary){
        String error = "Expected value mismatch!Argument weekSalary";
        if(weekSalary <= 10){
            throw new IllegalArgumentException(error);
        }
        this.weekSalary = weekSalary;
    }
    private double getWorkHoursPerDay(){
        return this.workHoursPerDay;
    }
    private void setWorkHoursPerDay(double workHoursPerDay){
        String error = "Expected value mismatch!Argument workHoursPerDay";
        if(workHoursPerDay < 1 || workHoursPerDay > 12){
            throw new IllegalArgumentException(error);
        }
        this.workHoursPerDay = workHoursPerDay;
    }
    private double salaryPerHour(){
        return (this.weekSalary / 7) / this.getWorkHoursPerDay();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString()
                + "Week Salary: " + df
        .format(this.getWeekSalary())
                + System.lineSeparator()
                + "Hours per day: " + df.format(this.getWorkHoursPerDay())
                + System.lineSeparator()
                + "Salary per hour: " + df.format(this.salaryPerHour());
    }
}
