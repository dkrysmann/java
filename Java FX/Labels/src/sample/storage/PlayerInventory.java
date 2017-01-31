package storage;

import constants.ItemConstants;
import constants.StorageConstants;

public class PlayerInventory extends Storage {
    private String filterType = ItemConstants.ITEM_TYPE_ALL;

    public PlayerInventory() throws Exception {
        super(StorageConstants.SIZE_PLAYER_STARTING_INVENTORY);
    }

    public void extendCapacity(int slots) throws Exception {
        if (slots <= 0)
            throw new Exception("Invalid Extension Slots Value");

        this.capacity += slots;
    }
}
