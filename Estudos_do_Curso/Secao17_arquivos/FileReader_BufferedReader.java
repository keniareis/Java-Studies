package org.Learnig.Estudos_do_Curso.Secao17_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferedReader {
    public static void main(String[] args){
        String path = "C:\\Users\\KENIA\\IdeaProjects\\Forms\\src\\main\\java\\org\\Learnig\\Estudos_do_Curso\\Secao17_arquivos\\teste.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
