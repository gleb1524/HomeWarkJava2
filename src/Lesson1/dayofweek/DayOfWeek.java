package Lesson1.dayofweek;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private int workingHours = 10;

    private final int HOURS = 8;

    public void getWorkingHours(DayOfWeek day){
        if(day == SATURDAY || day == SUNDAY){
            System.out.println("Сегодня выходной");
        }
        else System.out.println("Рабочих часов до конца недели осталось " + (5-day.compareTo(MONDAY))*HOURS);
    }
}