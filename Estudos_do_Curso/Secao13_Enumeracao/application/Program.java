package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.application;

import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.entities.Order;
import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args){

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
