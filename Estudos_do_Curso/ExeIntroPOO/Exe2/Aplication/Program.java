package org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe2.Aplication;

import org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe2.Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("\nEmployee: " + employee);

        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = scanner.nextDouble();

        employee.icreaseSlary(percentage);

        System.out.println("Update data: " + employee);

    }
}
