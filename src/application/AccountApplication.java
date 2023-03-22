package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AccountApplication {
    public static void main(String[] args) {


        Account acc = new Account(1001, "Joao", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Lucas", 0.0, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 1200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500.00);
            System.out.println("Loan");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount )acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        System.out.println("------------------------");
        Account acc6 = new SavingsAccount(1005, "Leopardo", 1000.0, 0.01);
        acc6.withDraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new Account(1006, "Paulo", 1000.0);
        acc7.withDraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1007, "Bob", 1000.0, 500.0);
        acc8.withDraw(200);
        System.out.println(acc8.getBalance());
    }
}
