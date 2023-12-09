package org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe3.Aplication;

import org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe3.Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.name = scanner.nextLine();
        student.nota1 = scanner.nextDouble();
        student.nota2 = scanner.nextDouble();
        student.nota3 = scanner.nextDouble();

        System.out.printf("\nFINAL GRADE = %.2f\n", student.finalGrade());
        System.out.println(student);
    }
}
