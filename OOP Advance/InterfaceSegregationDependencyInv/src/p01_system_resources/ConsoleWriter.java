package p01_system_resources;


public class ConsoleWriter implements Writer{


    @Override
    public void writeLine(String msg) {
        System.out.println(msg);
    }
}
