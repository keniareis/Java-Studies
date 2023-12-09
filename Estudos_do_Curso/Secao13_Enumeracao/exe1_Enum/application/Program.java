package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.application;

import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities.Departament;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities.HourContract;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities.Worker;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departamentName = scanner.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        System.out.print("How many contracts to this worker? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        scanner.close();
    }
}
