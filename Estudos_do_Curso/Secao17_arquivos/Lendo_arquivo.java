package org.Learnig.Estudos_do_Curso.Secao17_arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lendo_arquivo {
    public static void main(String[] args){
        File file = new File("C:\\Users\\KENIA\\IdeaProjects\\Forms\\src\\main\\java\\org\\Learnig\\Estudos_do_Curso\\Secao17_arquivos\\teste.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
