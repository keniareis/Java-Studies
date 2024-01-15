package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.excecoes_personalizadas.application;

import org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.excecoes_personalizadas.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Rom number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(scanner.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(scanner.next());

        if (!checkout.after(checkin)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else {
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(scanner.next());

            String error = reservation.updateDates(checkin, checkout);

            if (error != null) {
                System.out.println("Error in Reservation: " + error);
            }else {
                System.out.println("Reservation: " + reservation);
            }

        }


        scanner.close();
    }
}
