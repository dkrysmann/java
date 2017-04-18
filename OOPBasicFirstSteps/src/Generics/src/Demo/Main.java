package Demo;


public class Main {
    public static void main(String[] args) {
        Jar<Double> data = new Jar<>();
        data.add(2.5);
        data.add(3.14);
        data.add(22.5);
        data.add(10.00);
        data.printRemaingElements();
        data.remove();
        data.printRemaingElements();
    }
}
