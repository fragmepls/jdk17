package assignment5;

import java.util.Calendar;
import java.util.Date;

public class DateToWeekday {

    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        int day = calendar.get(Calendar.DAY_OF_WEEK);

        String dayName = getDayName(day);

        System.out.println("Hi, today it is " + dayName + " and this is the joke of the day: " + Jokes.getJokes(dayName)[0]);
    }

    private static String getDayName(int day) {
        return switch (day) {
            case Calendar.SUNDAY -> "Sunday";
            case Calendar.MONDAY -> "Monday";
            case Calendar.TUESDAY -> "Tuesday";
            case Calendar.WEDNESDAY -> "Wednesday";
            case Calendar.THURSDAY -> "Thursday";
            case Calendar.FRIDAY -> "Friday";
            case Calendar.SATURDAY -> "Saturday";
            default -> "";
        };
    }
}
