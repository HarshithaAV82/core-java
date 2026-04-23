package com.xworkz.Concert;
public class ConcertDetails extends Concert {

    boolean vip;
    int duration;

    public ConcertDetails(String name, int tickets, String[] singers, Organizer org, ConcertType type, boolean vip, int duration) {
        super(name, tickets, singers, org, type);
        this.vip = vip;
        this.duration = duration;
    }

    @Override
    public void start() {
        System.out.println("this is the class overide from from the parent class....");
    }

    @Override
    public void end() {
        System.out.println("this is the class override the method from parent class....");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + vip + ", " + duration;
    }
}