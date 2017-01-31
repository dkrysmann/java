package items;

import utilities.Validator;

public abstract class Item {
    private String name;

    public Item(String name) throws Exception {
        this.setName(name);
    }

    private void setName(String name) throws Exception {
        if (Validator.nameIsValid(name))
            this.name = name;
        else
            throw new Exception("Invalid Symbols In Item Name");
    }

    public String getName() { return this.name; }
}
