package org.Learnig.Resolvendo_Cases;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
    public static boolean isFibonacci(int num) {
        int  atual = 1, anterior = 0;
        int proximo = atual + anterior;

        if(num == atual || num == anterior) return true;

        while(proximo <= num){
            if (proximo == num)return true;
            anterior = atual;
            atual = proximo;
            proximo = atual + anterior;
        }

        return false;
    }
}
