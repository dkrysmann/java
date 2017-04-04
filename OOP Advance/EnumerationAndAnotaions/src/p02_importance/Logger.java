package p02_importance;


import java.util.ArrayList;
import java.util.List;

public class Logger {
    private Importance limit;
    private List<Message> messages;

    public Logger(Importance limit) {
        this.limit = limit;
        this.messages = new ArrayList<>();
    }
    public void recordMsg(Message message){
        if(message.getLevel().compareTo(this.limit) >= 0){
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages() {
        return messages;
    }

}
