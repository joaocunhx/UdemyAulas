package application;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {
    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Julia");
        list.add("Marco");
        list.add(2, "João");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        System.out.println("Index of Joao: " + list.indexOf("João"));
        System.out.println("----------------------");
        java.util.List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
