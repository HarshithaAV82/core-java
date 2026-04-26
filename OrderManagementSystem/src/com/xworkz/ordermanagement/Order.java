package com.xworkz.ordermanagement;

public class Order {

    private int orderId;
    private OrderStatus status;

    public Order(int orderId){
        this.orderId=orderId;
        this.status=OrderStatus.PLACED;
    }

    public void updateStatus(OrderStatus status){
        this.status=status;
    }
    public void printorder(){
        System.out.println("Order ID:" + orderId);
        status.displayStatus();
        System.out.println("Final Status:" + status.isFinalStatus());
    }

}
