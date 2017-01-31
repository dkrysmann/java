package storage;

import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Item> storedItems;
    int capacity;

    Storage(int capacity) throws Exception {
        if (capacity <= 0)
            throw new Exception("Invalid Storage Capacity");

        this.capacity = capacity;
        this.storedItems = new ArrayList<>(capacity);
    }

    public void addItem(Item item) throws Exception {
        if (this.storedItems.size() == capacity)
            throw new Exception("Storage Is Full");

        this.storedItems.add(item);
    }

    public Item removeItem(int index) throws Exception {
        if (index < 0 || index > this.capacity - 1)
            throw new Exception("Invalid Storage Item Index");

        return this.storedItems.remove(index);
    }
}
