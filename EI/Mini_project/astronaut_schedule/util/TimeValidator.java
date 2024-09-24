package Mini_project.astronaut_schedule.util;

public class TimeValidator {
    public static boolean isValidTime(String time) {
        return time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
    }
}
