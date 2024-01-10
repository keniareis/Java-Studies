package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_fix.application;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_fix.entities.Company;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_fix.entities.Individual;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_fix.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tax payers:");
        int num = scanner.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i < num+1; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            Character choice = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();

            if (choice == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));

            }else{
                System.out.print("Number of employees: ");
                int numberOfemployees = scanner.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberOfemployees));
            }
        }
        System.out.println("\nTAXES PAID:");

        Double total = 0.0;
        for (TaxPayer taxPayer: taxPayers) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f",taxPayer.tax()));
            total += taxPayer.tax();
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", total));



        scanner.close();
    }
}
