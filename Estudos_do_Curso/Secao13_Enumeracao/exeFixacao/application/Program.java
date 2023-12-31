package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exeFixacao.application;

import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.entities.enums.OrderStatus;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exeFixacao.model.entities.Client;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exeFixacao.model.entities.Order;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exeFixacao.model.entities.OrderItem;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exeFixacao.model.entities.Product;


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

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.printf("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), status, client);

        System.out.printf("How many items to this order? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)     {
            System.out.println("Enter #" + i + " item data:");
            System.out.printf("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();

            System.out.printf("Product price: ");
            Double productPrice = scanner.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.printf("Quantity: ");
            int quantity = scanner.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        scanner.close();
    }
}
