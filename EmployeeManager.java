package XenosisWeek4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}

public class EmployeeManager {
    private Map<Integer, Employee> employees;

    public EmployeeManager() {
        employees = new HashMap<>();
    }

    public void addEmployee(int id, Employee employee) {
        employees.put(id, employee);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Department: ");
                    String department = scanner.next();

                    Employee employee = new Employee(name, age, department);
                    manager.addEmployee(id, employee);
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    Employee emp = manager.getEmployee(id);
                    if (emp != null) {
                        System.out.println("Name: " + emp.getName());
                        System.out.println("Age: " + emp.getAge());
                        System.out.println("Department: " + emp.getDepartment());
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    manager.removeEmployee(id);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}