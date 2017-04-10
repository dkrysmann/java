package p01_system_resources;

import java.time.LocalTime;

public class LocalTimeProvider implements TimeProvider{
    private LocalTime localTime;

    @Override
    public int getHour() {
        this.localTime = LocalTime.now();
       return this.localTime.getHour();
    }
}
