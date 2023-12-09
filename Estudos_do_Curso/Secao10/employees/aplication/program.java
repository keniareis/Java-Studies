package org.Learnig.Estudos_do_Curso.Secao10.employees.aplication;

import org.Learnig.Estudos_do_Curso.Secao10.employees.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d\n", i+1);

            System.out.print("Id: ");
            int id = scanner.nextInt();

            while (hasId(list, id)){
                System.out.println("Id already taken! Try again");
                id = scanner.nextInt();
            }


            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int salaryId = scanner.nextInt();

        Employee emp = list.stream().filter(employee -> employee.getId() == salaryId).findFirst().orElse(null);

       // Integer pos = position(list, salaryId);

        if (emp == null){
            System.out.println("This Id does not exist");
        }else {
            System.out.println("Enter the percentage: ");
            double percentege = scanner.nextDouble();
            emp.increaseSalary(percentege);
        }

        System.out.println("List of employees:");
        for (Employee people: list) {
            System.out.println(people);
        }

        scanner.close();
    }

//    public static Integer position(List<Employee> list, int id){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id){
//                return i;
//            }
//        }
//        return null;
//    }

    public static boolean hasId(List<Employee> list, int id){
        Employee employee = list.stream().filter(employee1 -> employee1.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
