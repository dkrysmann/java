package entities;

import constants.EntityConstants;
import utilities.Validator;

public abstract class Entity {
    private String name;
    private String faction;

    public Entity(String name, String faction) throws Exception {
        this.setName(name);
        this.setFaction(faction);
    }

    private void setFaction(String faction) throws Exception {
        if (!EntityConstants.FACTIONS.contains(faction))
            throw new Exception("Invalid Entity Faction");
        else
            this.faction = faction;
    }

    private void setName(String name) throws Exception {
        if (Validator.nameIsValid(name))
            this.name = name;
        else
            throw new Exception("Invalid Entity Name Value");
    }

    public String getName() {
        return this.name;
    }
}
