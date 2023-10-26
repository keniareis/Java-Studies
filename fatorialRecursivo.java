package org.Learnig;

import java.util.Locale;
import java.util.Scanner;

public class fatorialRecursivo {

    public static int fatorial(int numero){
        if(numero == 0){
            return 1;
        }
        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero para o fatorial: ");
        int numero = scanner.nextInt();
        int fat = fatorial(numero);
        System.out.println(fat);
    }
}
