package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_fix.application;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_fix.entities.ImportedProduct;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_fix.entities.Product;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_fix.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i < numProducts + 1; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (choice == 'c'){
                products.add(new Product(name, price));

            } else if (choice == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, manufactureDate));

            } else if (choice == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}
