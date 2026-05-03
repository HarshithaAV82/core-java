package com.xworkz.system;

public class Admin extends User{


    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    void showRole() {
        System.out.println("Role: Admin");
    }

    void manageSystem(){
        System.out.println("Managing Metro System...");
    }
}
