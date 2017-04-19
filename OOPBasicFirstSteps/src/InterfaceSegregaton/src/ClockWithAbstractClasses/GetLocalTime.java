package ClockWithAbstractClasses;


import java.time.LocalTime;

public class GetLocalTime extends GetTime{

    @Override
    int getHour() {
       return LocalTime.now().getHour();
    }
}
