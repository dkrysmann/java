package DefaultMethods;

public interface Drawable {
    void draw();
    default void msg(){
        System.out.println("this is default method");
    }
}
