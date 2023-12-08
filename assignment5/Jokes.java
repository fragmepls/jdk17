package assignment5;

public class WeekdayJokes {

    public String[] getWeekdayJokes(String weekday) {
        return switch (weekday) {
            case "Monday" -> new String[]{"Joke 1", "Joke 2", "Joke 3"};
            case "Tuesday" -> new String[]{"Joke 4", "Joke 5", "Joke 6"};
            case "Wednesday" -> new String[]{"Joke 7", "Joke 8", "Joke 9"};
            case "Thursday" -> new String[]{"Joke 10", "Joke 11", "Joke 12"};
            case "Friday" -> new String[]{"Joke 13", "Joke 14", "Joke 15"};
            case "Saturday" -> new String[]{"Joke 16", "Joke 17", "Joke 18"};
            case "Sunday" -> new String[]{"Joke 19", "Joke 20", "Joke 21"};
            default -> null;
        };
    }
}
