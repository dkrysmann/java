package p03_GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(5,4);
        Scale<String> scale1 = new Scale<>("a","d");
        System.out.println(scale.getHeavier());
        System.out.println(scale1.getHeavier());
    }
}
