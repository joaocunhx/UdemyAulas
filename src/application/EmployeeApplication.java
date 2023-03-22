package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be regestred?");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Employee #" + i+1 + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println("List of employee:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}
