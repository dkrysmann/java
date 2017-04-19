package ClockWithAbstractClasses;

public class GreetingClock {
    private GetTime getTime;
    private PrintGreeting printGreeting;

    public GreetingClock(GetTime getTime,PrintGreeting printGreeting){
        this.getTime = getTime;
        this.printGreeting = printGreeting;
    }
    public void greeting(){
        if(this.getTime.getHour() < 12){
            this.printGreeting.printMsg("Good morning");
        }
        else if(this.getTime.getHour() < 18){
            this.printGreeting.printMsg("Good afternoon");
        }else{
            this.printGreeting.printMsg("Good evening");
        }
    }
}
