package entities;

import entities.Entity;
import items.Item;
import storage.Storage;

import static constants.EntityConstants.PLAYER_FACTION;

public class Player extends Entity {
    private Storage inventory;

    public Player(String name) throws Exception {
        super(name, PLAYER_FACTION);
    }

    public void takeItem(Item item) throws Exception {
    }
}
