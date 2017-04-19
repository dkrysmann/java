package Clock;

public class GreetingClock {

    private TimeProvider timeProvider;
    private Writer writer;

    public GreetingClock(TimeProvider timeProvider,Writer writer) {
        this.timeProvider = timeProvider;
        this.writer = writer;
    }

    public void greeting() {
        if (this.timeProvider.getHour() < 12) {
           this.writer.writer("Good morning");
        } else if (this.timeProvider.getHour() < 18) {
            this.writer.writer("Good afternoon");
        } else {
           this.writer.writer("Good evening");
        }
    }
}
