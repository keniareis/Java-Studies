package org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe1.Aplicattion;

import org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe1.Entities.Medidas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Medidas medidas = new Medidas();

        System.out.println("Enter rectangle width and height: ");
         medidas.width = scanner.nextDouble();
         medidas.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f\n", medidas.area());
        System.out.printf("PERIMETER = %.2f\n", medidas.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", medidas.diagonal());

    }
}
