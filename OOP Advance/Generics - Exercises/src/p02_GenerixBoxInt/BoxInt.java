package p02_GenerixBoxInt;


public class BoxInt <T>{
    private T type;

    public BoxInt(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type.getClass().getName() + ": " + this.type;
    }
}
