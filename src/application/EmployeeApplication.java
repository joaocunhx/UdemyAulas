package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsorced (y/n)? ");
            char outs = sc.next().charAt(0);
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per Hour: ");
                double valuePerHours = sc.nextDouble();
            if (outs == 'n') {
                list.add(new Employee(name, hours, valuePerHours));
            } else {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();;
                list.add(new OutsourcedEmployee(name, hours, valuePerHours, additional));;
            }
        }

        System.out.println();
        System.out.println("Payments:");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
