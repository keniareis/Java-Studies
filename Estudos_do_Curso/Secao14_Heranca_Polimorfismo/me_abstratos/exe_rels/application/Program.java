package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.application;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities.Circle;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities.Rectangle;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities.Shape;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int num = scanner.nextInt();

        List<Shape> shapes = new ArrayList<>();

        for (int i = 1; i < num+1; i++) {
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            Character choiceShape = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color choiceColor = Color.valueOf(scanner.next());


            if (choiceShape == 'r') {
                System.out.print("Width: ");
                double width = scanner.nextDouble();

                System.out.print("Heigth: ");
                double heigth = scanner.nextDouble();

                shapes.add(new Rectangle(choiceColor, width, heigth));
            } else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                
                shapes.add(new Circle(choiceColor, radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape: shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        scanner.close();
    }
}
