package p01_WeekDyas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {
   private List<WeeklyEntry> data;

    public WeeklyCalendar() {
        this.data = new ArrayList<>();
    }
    public void addEntry(String weekDay,String notes){
        WeeklyEntry entry = new WeeklyEntry(weekDay,notes);
        this.data.add(entry);
    }
    public Iterable<WeeklyEntry> getWeeklySchedule(){
        Collections.sort(data, WeeklyEntry.BY_WEEKDAY);
        return data;
    }
}
