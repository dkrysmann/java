package RandomArray;


public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArr = new RandomArrayList();
        randomArr.add(1);
        randomArr.add("p");
        randomArr.add(25);
        randomArr.add(new RandomArrayList());
        System.out.println(randomArr.getRandomElement());
        System.out.println(randomArr.getRandomElement());
        System.out.println(randomArr.getRandomElement());
        System.out.println(randomArr.getRandomElement());
    }
}
