package Mini_project.astronaut_schedule.model;
import Mini_project.astronaut_schedule.util.TimeValidator;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        if (!TimeValidator.isValidTime(startTime) || !TimeValidator.isValidTime(endTime)) {
            throw new IllegalArgumentException("Invalid time format.");
        }
        return new Task(description, startTime, endTime, priority);
    }
}
