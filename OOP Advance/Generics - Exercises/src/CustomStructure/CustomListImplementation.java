package CustomStructure;


import java.util.ArrayList;
import java.util.List;

public class CustomListImplementation<T extends Comparable<T>> implements CustomList<T> {
    private List<T> items;
    public CustomListImplementation(){
        this.items = new ArrayList<T>();
    }

    @Override
    public void add(T element) {
        this.items.add(element);
    }

    @Override
    public T remove(int index) {
       return this.items.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.items.contains(element);
    }

    @Override
    public void swap(int fromIndex, int toIndex) {
        T firstElement = this.items.get(fromIndex);
        T secondElement = this.items.get(toIndex);
        this.items.set(fromIndex,secondElement);
        this.items.set(toIndex,firstElement);
    }

    @Override
    public int countGreaterThan(T element) {
        return (int)this.items.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    @Override
    public T getMax() {
      T currentElement = this.items.get(0);
        for (T item : items) {
            if(item.compareTo(currentElement) > 0){
                currentElement = item;
            }
        }
        return currentElement;
    }

    @Override
    public T getMin() {
       T currentElement = this.items.get(0);
        for (T item : items) {
            if(item.compareTo(currentElement) < 0){
                currentElement = item;
            }
        }
        return currentElement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T item : items) {
            stringBuilder.append(item).append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();
    }
}
