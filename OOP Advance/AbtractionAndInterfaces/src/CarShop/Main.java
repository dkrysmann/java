package CarShop;


public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon","white",120,"Germany");
        System.out.println(String.format("%s is %s color and have %s horse power",seat.getModel(),seat.getColor()
        ,seat.getHorsePower()));
        System.out.println(seat.toString());
    }
}
