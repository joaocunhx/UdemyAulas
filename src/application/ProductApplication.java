package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductApplication {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (cui == 'c') {
                list.add(new Product(name, price));
            } else if (cui == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double cfe = sc.nextDouble();
                list.add(new ImportedProduct(name, price, cfe));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product pro : list) {
            System.out.println(pro.priceTag());
        }
        sc.close();
    }
}
