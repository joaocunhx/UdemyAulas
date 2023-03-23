package application;

import entities.Contribuinte;
import entities.ContribuinteFisico;
import entities.ContribuinteJuridico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContribuinteApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new ContribuinteFisico(name, income, health));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add( new ContribuinteJuridico(name, income, employees));
            }
        }

        System.out.println();
        System.out.println("Taxes paid:");
        for (Contribuinte con : list) {
            System.out.println(con.getName() + ": $ " + con.tax());
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Contribuinte con : list) {
            System.out.println(con.getName() + " $ " + String.format("%.2f", con.tax()));
        }

        double sum = 0.0;
        for (Contribuinte con : list) {
            sum += con.tax();
        }
        System.out.printf("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}