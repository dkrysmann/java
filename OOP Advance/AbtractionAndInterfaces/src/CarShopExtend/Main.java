package CarShopExtend;


public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon","Gray",110,"Spain",123.45);
        Car audi = new Audi("A3","White",110,"Germany",2,20.2);
        printCarInfo(seat);
        printCarInfo(audi);

    }
    public static void printCarInfo(Car car){
        System.out.println(String.format("%s is %s color and have %s horse power",car.getModel(),car.getColor(),
                car.getHorsePower()));
    }
}
