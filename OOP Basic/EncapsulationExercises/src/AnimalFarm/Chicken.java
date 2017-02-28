package AnimalFarm;


public class Chicken {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 15;
    private String name;
    private int age;

    public Chicken(String name,int age){
        this.setName(name);
       this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(this.getName() == null || this.getName().trim().length() == 0){
            String errorMsg = "Name cannot be empty.";
            throw new IllegalArgumentException(errorMsg);
        }
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if(age < MIN_AGE || age > MAX_AGE){
           String errorMsg = "Age should be between 0 and 15.";
           throw new IllegalArgumentException(errorMsg);
        }
        this.age = age;
    }
    private double calculateProductPerDay(){
        if(this.getAge() < 6){
           return 2;
        }else if(this.getAge() >= 6 || this.getAge() < 12){
            return 1;
        }
        return 0.75;
    }
    public double getProductPerDay() {
        return this.calculateProductPerDay();
    }
}
