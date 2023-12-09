package org.Learnig.Estudos_do_Curso.Secao10.Vetores.Pensionato.aplication;

import org.Learnig.Estudos_do_Curso.Secao10.Vetores.Pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rent[] vetor = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d: \n", i+1);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("email:");
            String email = scanner.next();
            System.out.print("Room: ");
            int roomNumber = scanner.nextInt();

            Rent rent = new Rent(name, email);

            vetor[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null){
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }
}
