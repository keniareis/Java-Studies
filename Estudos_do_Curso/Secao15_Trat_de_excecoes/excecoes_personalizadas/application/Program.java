package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.excecoes_personalizadas.application;

import org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.excecoes_personalizadas.model.entities.Reservation;
import org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.excecoes_personalizadas.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Rom number: ");
            int roomNumber = scanner.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(scanner.next());

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(scanner.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);

        }catch (ParseException e){
            System.out.println("Invalid date format");
        }catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unexpected error");
        }


        scanner.close();
    }
}
