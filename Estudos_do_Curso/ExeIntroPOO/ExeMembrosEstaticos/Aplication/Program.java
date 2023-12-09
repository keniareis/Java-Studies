package org.Learnig.Estudos_do_Curso.ExeIntroPOO.ExeMembrosEstaticos.Aplication;

import org.Learnig.Estudos_do_Curso.ExeIntroPOO.ExeMembrosEstaticos.util.CurrencyConvertee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConvertee.valorDolar = scanner.nextDouble();

        System.out.print("\nHow many dollars will be bought? ");
        CurrencyConvertee.cotacao = scanner.nextDouble();

        System.out.println("Amount to be paid in reais = " + CurrencyConvertee.converter());
    }
}
