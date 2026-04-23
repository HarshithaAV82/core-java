package com.xworkz.Jail;
public class JailOwner{
        String name;
        String place;

        public JailOwner(String name, String place){
            this.name = name;
            this.place = place;
        }

        public String toString(){
            return name + ", " + place;
        }
    }
