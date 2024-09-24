package Mini_project.astronaut_schedule.manager;
import Mini_project.astronaut_schedule.model.Task;

public class TaskNotifier implements TaskObserver {
    @Override
    public void notifyTaskConflict(Task newTask, Task conflictingTask) {
        System.out.println();
        System.out.println("Conflict Detected! New task: \"" + newTask.getDescription() +
                           "\" conflicts with \"" + conflictingTask.getDescription() + "\"");
    }
}
