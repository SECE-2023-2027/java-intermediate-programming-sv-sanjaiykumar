import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter employee base salary: ");
        double employeeSalary = scanner.nextDouble();

        System.out.print("Enter manager name: ");
        scanner.nextLine();
        String managerName = scanner.nextLine();

        System.out.print("Enter manager base salary: ");
        double managerBaseSalary = scanner.nextDouble();

        System.out.print("Enter manager bonus: ");
        double managerBonus = scanner.nextDouble();

        Employee emp = new Employee(employeeName, employeeSalary);
        Manager mgr = new Manager(managerName, managerBaseSalary, managerBonus);

        System.out.println("Employee salary: " + emp.calculateSalary());
        System.out.println("Manager salary: " + mgr.calculateSalary());

        scanner.close();
    }
}
