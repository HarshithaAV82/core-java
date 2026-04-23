package com.xworkz.Actor;
    public class ActorRunner{

        public static void main(String[] args){

            ActorPlace place = new ActorPlace("RK Studio", "Mumbai");
            String[] movies = {"KGF", "Bahubali"};
            Actor actor = new Actor("Yash", 35, movies, place, ActorType.HERO);
            actor.act();
            actor.rest();
            System.out.println(actor);

            ActorChild child = new ActorChild("Prabhas", 40, movies, place, ActorType.HERO, 5, true);
            child.act();
            child.rest();
            System.out.println(child);
        }
    }
