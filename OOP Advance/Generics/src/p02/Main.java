package p02;


public class Main {
    public static void main(String[] args) {
        Integer[] integers = ArrayCreator.create(Integer.class,5, 10);
        String[] strings = ArrayCreator.create(String.class,3,"addItems");
        System.out.println(integers.length);
        System.out.println(strings.length);
    }
}
