package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora2 {
    public static void main(String[] args) {


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d04 = LocalDate.parse("2023-03-11");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-11T14:55:03");
        Instant d06 = Instant.parse("2023-03-11T14:55:03Z");

        System.out.println("d04: " + d04.format(fmt1));
        System.out.println("d05: " + d05.format(fmt2));
        System.out.println("d06: " + fmt3.format(d06));


    }
}
