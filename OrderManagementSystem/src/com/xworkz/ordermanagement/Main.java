package com.xworkz.ordermanagement;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(101);
        order.printorder();

        System.out.println("Updating status....");

        order.updateStatus(OrderStatus.SHIPPED);
        order.printorder();

        System.out.println("Final Update...");

        order.updateStatus(OrderStatus.DELIVERED );
        order.printorder();
    }

}
