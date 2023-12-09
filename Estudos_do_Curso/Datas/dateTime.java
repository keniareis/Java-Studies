package org.Learnig.Estudos_do_Curso.Datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//INSTANCIAÇÃO
public class dateTime {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


      //• (agora) ➞ Data-hora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

      //• Texto ISO 8601 ➞ Data-hora
        LocalDate d04 = LocalDate.parse("2023-11-08");
        LocalDateTime d05 = LocalDateTime.parse("2023-11-08T10:15:38");
        Instant d06 = Instant.parse("2023-11-08T10:15:38Z");
        Instant d07 = Instant.parse("2023-11-08T10:15:38-03:00");

      //• Texto formato customizado ➞ Data-hora
        LocalDate d08 = LocalDate.parse("08/11/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("08/11/2023 01:30", fmt2);

      //• dia, mês, ano, [horário] ➞ Data-hora local
        LocalDate d10 = LocalDate.of(2020, 3, 16);
        LocalDateTime d11 = LocalDateTime.of(2020, 3, 16, 1, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }
}
