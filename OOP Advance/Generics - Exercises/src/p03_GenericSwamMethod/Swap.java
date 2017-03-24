package p03_GenericSwamMethod;

public class Swap <E>{
    private E element;

    public Swap(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName() + ": " + this.element;
    }
}
