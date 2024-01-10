package org.Learnig.Estudos_do_Curso.Secao15_Trat_de_excecoes.exemplo_tryCatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bloco_finally {
    public static void main(String[] args){
        File file = new File("C:\\temp\\in.txt");
        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error opening file: " + e.getMessage());
        }finally{
            if (scanner != null){
                scanner.close();
            }
            System.out.println("Scanner close");
        }

    }
}
