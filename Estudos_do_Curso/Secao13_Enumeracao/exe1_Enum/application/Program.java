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

        // Configurando o padrão de localização para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Inicializando um objeto Scanner para entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Definindo o formato de data para DD/MM/YYYY
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Solicitando e lendo o nome do departamento
        System.out.print("Enter department's name: ");
        String departamentName = scanner.nextLine();

        // Solicitando e lendo dados do trabalhador
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        // Criando um objeto Worker com os dados fornecidos
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        // Solicitando e lendo o número de contratos para este trabalhador
        System.out.print("How many contracts to this worker? ");
        int n = scanner.nextInt();

        // Loop para inserir dados de contrato
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract " + n + " data:");

            // Solicitando e lendo dados do contrato
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());

            System.out.printf("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.printf("Duration (hours): ");
            int hours = scanner.nextInt();

            // Criando um objeto HourContract com os dados fornecidos e adicionando ao trabalhador
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        // Solicitando e lendo o mês e ano para calcular o rendimento
        System.out.println();
        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();

        // Obtendo o mês e ano fornecidos
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        // Exibindo informações sobre o trabalhador e seu rendimento para o mês/ano especificado
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        // Fechando o Scanner para liberar recursos
        scanner.close();
    }
}
