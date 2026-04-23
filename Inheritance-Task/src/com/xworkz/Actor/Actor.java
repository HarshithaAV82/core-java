package com.xworkz.Actor;

import java.util.Arrays;

    public class Actor {

        String name;
        int age;
        String[] movies;
        ActorPlace place;
        ActorType type;

        public Actor(String name, int age, String[] movies, ActorPlace place, ActorType type) {
            this.name = name;
            this.age = age;
            this.movies = movies;
            this.place = place;
            this.type = type;
        }

        public void act() {
            System.out.println(" the Hero is Acting");
        }

        public void rest() {
            System.out.println("The hero is Resting After movie completed...");
        }

        @Override
        public String toString() {
            return name + ", " + age + ", " + Arrays.toString(movies) + ", " + place + ", " + type;
        }
    }

