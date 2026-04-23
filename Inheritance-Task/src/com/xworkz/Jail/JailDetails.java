package com.xworkz.Jail;
public class JailDetails extends Jail{
    boolean security;
    int guards;

    public JailDetails(String jailName, int rooms, String[] prisoners, JailOwner owner, JailType type, boolean security, int guards) {
        super(jailName, rooms, prisoners, owner, type);
        this.security = security;
        this.guards = guards;
    }

    public void open(){
        System.out.println("Jail is open...");
    }
    public void close(){
        System.out.println("Jail is close.....");
    }

    public String toString(){
        return super.toString() + ", " + security + ", " + guards;
    }
}