package Clock;


public class PrintMessage implements Writer{
    @Override
    public void writer(String msg) {
        System.out.println(msg);
    }
}
