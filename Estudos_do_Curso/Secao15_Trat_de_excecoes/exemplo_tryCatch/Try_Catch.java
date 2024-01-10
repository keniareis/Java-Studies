package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.exemplo_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args){
        method1();

        System.out.println("End of Program");;
    }

    public static void method1(){
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 START ***");
    }

    public static void method2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** METHOD2 START ***");

        try{
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            scanner.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }

        scanner.close();
        System.out.println("*** METHOD2 END***");
    }
}
