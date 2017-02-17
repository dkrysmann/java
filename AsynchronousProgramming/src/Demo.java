
public class Demo {
    public static void main(String[] args) {
        Runnable task = () ->{
            for (int i = 0; i < 10; i++) {
                System.out.printf("[%s]%n",i);
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
