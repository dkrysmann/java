package Mankind;


public class Human {
    private String name;
    private String lastName;

    public Human(String name, String lastName) {
        this.setName(name);
        this.setLastName(lastName);
    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (!Character.isUpperCase(name.charAt(0))) {
            String error = "Expected upper case letter!Argument firstName";
            throw new IllegalArgumentException(error);
        } else if(name.trim().length() < 4) {
            String error = "Expected length at least 4 symbols!Argument:firstName";
            throw new IllegalArgumentException(error);
        }
        this.name = name;
    }

    private String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        if (!Character.isUpperCase(name.charAt(0))) {
            String error = "Expected upper case letter!Argument:lastName";
            throw new IllegalArgumentException(error);
        }
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name: " + this.getName()
                + System.lineSeparator()
                + "Last Name: " + this.getLastName()
                + System.lineSeparator();
    }
}
