package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.Exe_fixacao.application;

import org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.Exe_fixacao.model.entities.Account;
import org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.Exe_fixacao.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.print("Holder: ");
        scanner.next();
        String holder = scanner.nextLine();

        System.out.print("Inicial balance: ");
        double inicialBalance = scanner.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, inicialBalance, withdrawLimit);
        System.out.println("\nEnter amount for withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }


        scanner.close();
    }
}
