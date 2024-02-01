package org.Learnig.Estudos_do_Curso.Secao17_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {
    public static void main(String[] args){

        String[] lines = new String[] {"Good morning", "Good afternoom", "Good night"};

        String path = "C:\\Users\\kenia\\OneDrive\\Documentos\\Forms\\src\\main\\java\\org\\Learnig\\Estudos_do_Curso\\Secao17_arquivos\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
