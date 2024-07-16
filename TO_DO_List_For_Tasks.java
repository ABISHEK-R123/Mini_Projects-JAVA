import java.util.*;

class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }

    public void markTaskCompleted(int index) {
        tasks.get(index).setCompleted(true);
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isCompleted() ? "Completed" : "Pending";
            System.out.println((i + 1) + ". " + task.getDescription() + " - " + status);
        }
    }
}

public class TO_DO_List_For_Tasks
{
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task description: ");
                    String description = in.nextLine();
                    taskManager.addTask(description);
                    break;
                case "2":
                    System.out.print("Enter task number to delete: ");
                    int indexToDelete = Integer.parseInt(in.nextLine()) - 1;
                    taskManager.deleteTask(indexToDelete);
                    break;
                case "3":
                    System.out.print("Enter task number to mark as completed: ");
                    int indexToComplete = Integer.parseInt(in.nextLine()) - 1;
                    taskManager.markTaskCompleted(indexToComplete);
                    break;
                case "4":
                    taskManager.displayTasks();
                    break;
                case "5":
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}