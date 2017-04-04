package p01_WeekDyas;


import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getCompratatorByWeekDay();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekdays, String notes) {
       this.weekday = Weekday.valueOf(Weekday.class,weekdays.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.weekday,this.notes);
    }
    private static Comparator<WeeklyEntry> getCompratatorByWeekDay() {
        return (e1,e2) -> Integer.compare(e1.weekday.ordinal(),e2.weekday.ordinal());
    }
}
