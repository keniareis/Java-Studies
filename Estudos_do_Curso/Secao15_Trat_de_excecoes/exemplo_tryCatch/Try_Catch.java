package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.exemplo_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }

        System.out.println("End of Program");;

        scanner.close();
    }
    
}
