package com.xworkz.Actor;

public class ActorPlace{
        String name;
        String city;

        public ActorPlace(String name, String city) {
            this.name = name;
            this.city = city;
        }

        @Override
        public String toString() {
            return name + ", " + city;
        }
    }

