package Mini_project.astronaut_schedule;
import Mini_project.astronaut_schedule.manager.ScheduleManager;
import Mini_project.astronaut_schedule.manager.TaskNotifier;
import Mini_project.astronaut_schedule.model.TaskFactory;
import Mini_project.astronaut_schedule.util.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        scheduleManager.addObserver(new TaskNotifier());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAstronaut Schedule Organizer:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:mm): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time (HH:mm): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority (Low/Medium/High): ");
                    String priority = scanner.nextLine();
                    try {
                        scheduleManager.addTask(TaskFactory.createTask(description, startTime, endTime, priority));
                        Logger.log("Task added: " + description);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter task description to remove: ");
                    String taskDescription = scanner.nextLine();
                    scheduleManager.removeTask(taskDescription);
                    Logger.log("Task removed: " + taskDescription);
                    break;
                case 3:
                    scheduleManager.viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
