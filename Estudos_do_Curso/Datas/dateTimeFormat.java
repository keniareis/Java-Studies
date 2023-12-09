package org.Learnig.Estudos_do_Curso.Datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormat {
    public static void main(String[] args){

        LocalDate d04 = LocalDate.parse("2023-11-08");
        LocalDateTime d05 = LocalDateTime.parse("2023-11-08T10:15:38");
        Instant d06 = Instant.parse("2023-11-08T10:15:38Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(d04.format(fmt1));
        System.out.println(fmt1.format(d04));

    }
}
