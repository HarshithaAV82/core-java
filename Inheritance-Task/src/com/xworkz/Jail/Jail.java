 package com.xworkz.Jail;
import java.util.Arrays;
    public class Jail{

        String jailName;
        int rooms;
        String[] prisoners;
        JailOwner owner;
        JailType type;

        public Jail(String jailName, int rooms, String[] prisoners, JailOwner owner, JailType type) {
            this.jailName = jailName;
            this.rooms = rooms;
            this.prisoners = prisoners;
            this.owner = owner;
            this.type = type;
        }

        public void open() {
            System.out.println("Jail is always open for prisoner...");
        }
        public void close(){
            System.out.println("Jail is not for good one...");
        }

        public String toString(){
            return jailName + ", " + rooms + ", " + Arrays.toString(prisoners) + ", " + owner + ", " + type;
        }
}
