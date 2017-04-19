package Demo;


public class Lamp implements SwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Light up");
    }

    @Override
    public void turnOff() {
        System.out.println("Light down");
    }
}
