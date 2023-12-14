package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe_Fixacao.entities;

import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe_Fixacao.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClients() {
        return client;
    }
    public void setClients(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }
    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem item: items) {
            sum += item.subTotal();
        }
        return sum;
    }

}
