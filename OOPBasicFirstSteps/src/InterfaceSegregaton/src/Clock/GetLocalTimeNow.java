package Clock;


import java.time.LocalTime;

public class GetLocalTimeNow implements TimeProvider{


    @Override
    public int getHour() {
     return LocalTime.now().getHour();
    }
}
