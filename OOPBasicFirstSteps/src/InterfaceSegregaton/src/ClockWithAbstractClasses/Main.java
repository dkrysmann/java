package ClockWithAbstractClasses;


public class Main {
    public static void main(String[] args) {
        GreetingClock clock = new GreetingClock(new GetLocalTime(),new ConsoleWriter());
        clock.greeting();
    }
}
