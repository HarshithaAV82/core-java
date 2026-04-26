package com.xworkz.ordermanagement;

enum OrderStatus {
    PLACED("Order Placed", false),
    SHIPPED("Order shipped", false),
    DELIVERED("Order delivered", true),
    CANCELLED("Order cancelled", true);

    private String message;
    private boolean isFinal;

    OrderStatus(String message, boolean isFinal){
        this.message=message;
        this.isFinal=isFinal;
    }

    public boolean isFinalStatus() {
        return isFinal;
    }

    public void displayStatus(){
        System.out.println(this.name() + "->" + message);
    }
}