package Scale;


public class Main {
    public static void main(String[] args) {
        ScaleUtil<Integer> scale = new ScaleUtil<>(5,3);
        System.out.println(scale.getHeavier());
    }
}
