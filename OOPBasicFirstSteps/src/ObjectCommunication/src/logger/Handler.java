package logger;


public interface Handler {
    void handle(LogType type,String msg);
    void setSuccessor(Handler successor);
}
