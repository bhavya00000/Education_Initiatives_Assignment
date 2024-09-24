package Mini_project.astronaut_schedule.manager;
import Mini_project.astronaut_schedule.model.Task;
import java.util.ArrayList;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        for (Task existingTask : tasks) {
            if (isOverlap(task, existingTask)) {
                notifyObservers(task, existingTask);
                throw new IllegalArgumentException("Task conflicts with existing task: " + existingTask.getDescription());
            }
        }
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime));
    }

    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println();
            System.out.println("Task removed successfully.");
        } else {
            System.out.println();
            System.out.println("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println();
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        for (Task task : tasks) {
            System.out.println();
            System.out.println(task);
        }
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Task newTask, Task conflictingTask) {
        for (TaskObserver observer : observers) {
            observer.notifyTaskConflict(newTask, conflictingTask);
        }
    }

    private boolean isOverlap(Task newTask, Task existingTask) {
        return newTask.getStartTime().compareTo(existingTask.getEndTime()) < 0 &&
               newTask.getEndTime().compareTo(existingTask.getStartTime()) > 0;
    }
}
