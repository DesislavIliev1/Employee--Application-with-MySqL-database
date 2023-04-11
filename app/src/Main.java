import Service.EmployeeService;
import Service.TaskService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        TaskService taskService = new TaskService();
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("****************** Welcome to Employee Management System ****************");
        System.out.println("1.Employee options");
        System.out.println("2.Task options");
        System.out.println("Enter your choice: ");
        choice = scan.nextInt();
        switch (choice) {
            case 1: {
                do {
                    System.out.println("1.Add Employee");
                    System.out.println("2. View Employee");
                    System.out.println("3. Update Employee");
                    System.out.println("4. Delete Employee");
                    System.out.println("5. View All Employees");
                    System.out.println("6. View top 5 Employees with the most Tasks");
                    System.out.println("0. Exit");

                    System.out.println("Enter your choice: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            service.addEmployee();
                            break;
                        case 2:
                            service.viewEmployee();
                            break;
                        case 3:
                            service.updateEmployee();
                            break;
                        case 4:
                            service.deleteEmployee();
                            break;
                        case 5:
                            System.out.println("View all employees");
                            service.viewAllEmployees();
                            break;
                    }
                } while (choice != 0);
                break;

            }
            case 2:
                do {
                    System.out.println("1.Add Task");
                    System.out.println("2. View Task");
                    System.out.println("3. Update Task");
                    System.out.println("4. Delete Task");
                    System.out.println("5. View All Tasks");
                    System.out.println("0. Exit");

                    System.out.println("Enter your choice: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            taskService.addTask();
                            break;
                        case 2:
                            taskService.viewTask();
                            break;
                        case 3:
                            taskService.updateTask();
                            break;
                        case 4:
                           taskService.deleteTask();
                            break;
                        case 5:
                            System.out.println("View all employees");
                           taskService.viewAllTasks();
                            break;
                    }
                } while (choice != 0);
                break;

        }
    }
}