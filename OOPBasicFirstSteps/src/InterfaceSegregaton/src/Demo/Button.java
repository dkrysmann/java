package Demo;


public class Button {
    private Lamp lamp;

    public Button(){
        this.lamp = new Lamp();
    }
    public void poll(){
        lamp.turnOn();
    }
    public void pollDown(){
        lamp.turnOff();
    }
}
