package app.io;


public class ConsoleWriter implements Writer{

    @Override
    public void write(String msg) {
        System.out.print(msg);
    }

    @Override
    public void writeLine(String msg) {
        System.out.println(msg);
    }
}
