package Mini_project.astronaut_schedule.manager;
import Mini_project.astronaut_schedule.model.Task;

public interface TaskObserver {
    void notifyTaskConflict(Task newTask, Task conflictingTask);
}


