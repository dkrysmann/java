package RandomArrList;


public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add(1);
        randomArrayList.add("ssss");
        randomArrayList.add(2.5);
        randomArrayList.add(33333);
        for (int i = 0; i < randomArrayList.size(); i++) {
            System.out.println(randomArrayList.getRandomElement());
        }
    }
}
