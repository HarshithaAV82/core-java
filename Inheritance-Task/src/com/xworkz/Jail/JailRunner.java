package com.xworkz.Jail;
    public class JailRunner {
        public static void main(String[] args) {
            JailOwner owner = new JailOwner("Govt", "Bangalore");
            String[] prisoners = {"Amul", "Barath"};

            Jail jail = new Jail("Central Jail", 50, prisoners, owner, JailType.BIG);
            System.out.println("printing the details of jail...");
            jail.open();
            jail.close();
            System.out.println(jail);

            JailDetails details = new JailDetails("City Jail", 30, prisoners, owner, JailType.SMALL, true, 10);
            System.out.println("jail is having all types of prisoner...");
            details.open();
            details.close();
            System.out.println(details);
        }
    }

