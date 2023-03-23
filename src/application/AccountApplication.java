package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountApplication {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
        list.add(new BusinessAccount(1003, "Bob", 1000.0, 500.0));
        list.add(new SavingsAccount(1004, "Lucas", 500.0, 0.01));
        list.add(new BusinessAccount(1005, "Lia", 800.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.println("Total balance: "+sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance account %d: %.2f", acc.getNumber(), acc.getBalance());
        }
    }
}
