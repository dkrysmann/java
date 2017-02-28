package TEst;


public class Chicken {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 15;

    private String name;
    private int age;

    Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    private void setName(String name) {
        if (name.isEmpty() || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    double getProductPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (this.getAge() < 6) {
            return 2;
        } else if (this.getAge() >= 6 && this.getAge() < 12) {
            return 1;
        }
        return 0.75;
    }
}