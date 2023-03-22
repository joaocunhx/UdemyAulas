package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WorkerApplication {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("Enter the department´s name: ");
        String departmenr = sc.next();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmenr));

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Enter the contract #" + i + " data:");
            System.out.print("Date (dd/MM/yyy): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }

            System.out.println();
            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            String monthAndYear = sc.next();
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));
            System.out.print("Worker: " + worker.getName());
            System.out.print("Department: " + worker.getDepartment().getName());
            System.out.print("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}

