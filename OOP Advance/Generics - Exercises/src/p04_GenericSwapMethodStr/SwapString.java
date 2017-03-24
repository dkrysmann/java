package p04_GenericSwapMethodStr;


public class SwapString <E>{
    private E elements;

    public SwapString(E elements) {
        this.elements = elements;
    }
    @Override
    public String toString() {
        return this.elements.getClass().getName() + ": " + this.elements;
    }
}
