package ClockWithAbstractClasses;

import java.time.LocalTime;

public class GetLocalTime extends GetTime{
    private LocalTime localTime;

   public GetLocalTime(){
       this.localTime = LocalTime.now();
   }

    @Override
    int getHour() {
        return this.localTime.getHour();
    }
}
