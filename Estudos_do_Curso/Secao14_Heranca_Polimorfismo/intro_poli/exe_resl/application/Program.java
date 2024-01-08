package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_resl.application;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_resl.entities.Employee;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_resl.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        Integer employeeNum = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i < employeeNum + 1; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsource (y/n)? ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            Integer hours = scanner.nextInt();

            System.out.print("Value per hours: ");
            Double valuePerHours = scanner.nextDouble();

            if ( choice == 'n') {
                employees.add(new Employee(name, hours, valuePerHours));

            } else if (choice == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = scanner.nextDouble();

                employees.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        scanner.close();
    }
}
