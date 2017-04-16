package CarShop;


public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon","White",110,"Spain");
        Car audi = new Audi("A6","Black",150,5,20.00,20.000);
        System.out.println(audi.toString());
        System.out.println(seat.toString());
    }

}
