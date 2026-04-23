package com.xworkz.Actor;
    public class ActorChild extends Actor {

        int awards;
        boolean famous;

        public ActorChild(String name, int age, String[] movies, ActorPlace place, ActorType type,int awards, boolean famous) {
            super(name, age, movies, place, type);
            this.awards = awards;
            this.famous = famous;
        }

        @Override
        public void act() {
            System.out.println("the hero Child acting");
        }

        @Override
        public void rest() {
            System.out.println("the hero Child resting");
        }

        @Override
        public String toString() {
            return super.toString() + ", Awards: " + awards + ", Famous: " + famous;
        }
    }
