package p01_WeekDyas;


public class Main {
    public static void main(String[] args) {
        WeeklyCalendar calendar = new WeeklyCalendar();
        calendar.addEntry("Saturday","basketball");
        calendar.addEntry("Monday","swimming");
        calendar.addEntry("Tuesday","football");
        for (WeeklyEntry weeklyEntry : calendar.getWeeklySchedule()) {
            System.out.println(weeklyEntry);
        }
    }
}
