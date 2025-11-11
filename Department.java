import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee teamLeader;
    private List<Employee> employees;
    private List<String> tasks;
    private List<Boolean> taskStatus;

    // Constructor
    public Department(String name, Employee teamLeader) {
        this.name = name;
        this.teamLeader = teamLeader;
        this.employees = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.taskStatus = new ArrayList<>();
    }

    public void changeTeamLeader(Employee newLeader) {
        this.teamLeader = newLeader;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void replaceEmployee(Employee oldEmployee, Employee newEmployee) {
        int index = employees.indexOf(oldEmployee);
        if (index != -1) {
            employees.set(index, newEmployee);
        }
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
        taskStatus.add(false);
    }

    public void completeTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(taskName)) {
                taskStatus.set(i, true);
            }
        }
    }

    public void printInfo() {
        System.out.println("Department: " + name);
        System.out.println("Team Leader: " + teamLeader.getFullName());

        System.out.println("\nEmployees:");
        for (Employee e : employees) {
            System.out.println("- " + e.getFullName());
        }

        System.out.println("\nTasks:");
        for (int i = 0; i < tasks.size(); i++) {
            String status = taskStatus.get(i) ? "Completed" : "In Progress";
            System.out.println("- " + tasks.get(i) + " : " + status);
        }
    }
}
