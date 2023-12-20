package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.Treino.applications;

import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.Treino.model.entities.Client;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.Treino.model.entities.Order;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.Treino.model.entities.OrderItem;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.Treino.model.entities.Product;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.entities.enums.OrderStatus;

import javax.xml.crypto.Data;
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

        System.out.println("Enter client data: ");
        System.out.printf("Name: ");
        String name = scanner.nextLine();
        System.out.printf("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());;

        System.out.printf("How many items to this order? ");
        int n = scanner.nextInt();

        Order order = new Order(new Date(), status, client);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.printf("Product name: ");
            String productName = scanner.next();
            System.out.printf("Product price: ");
            Double productPrice = scanner.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.printf("Quantity: ");
            int quantity = scanner.nextInt();

            OrderItem item = new OrderItem(quantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        scanner.close();
    }
}
