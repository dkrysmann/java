package p01;


public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("Hello");
        jar.add("World");
        jar.remove();
        jar.remove();
        jar.showElement();
    }
}
