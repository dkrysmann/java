package Clock;


public class Main {
    public static void main(String[] args) {
        GreetingClock clock = new GreetingClock(new GetLocalTimeNow(),new PrintMessage());
        clock.greeting();
    }
}
