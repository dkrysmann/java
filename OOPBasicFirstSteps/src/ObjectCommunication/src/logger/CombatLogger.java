package logger;

public class CombatLogger implements Handler{

    private Handler successor;

    @Override
    public void handle(LogType type, String msg) {
        if(type.equals(LogType.ATTACK) || type.equals(LogType.MAGIC)){
            System.out.println(type.name() + ": " + msg);
        }
    }

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
