package com.xworkz.Movie;

     import java.util.Arrays;
public class Movie{
        String title;
        int duration;
        String[] actors;
        MovieCompany company;
        MovieType type;

        public Movie(String title, int duration, String[] actors, MovieCompany company, MovieType type){
            this.title = title;
            this.duration = duration;
            this.actors = actors;
            this.company = company;
            this.type = type;
        }

        public void play(){

            System.out.println("Playing movie");
        }

        public void stop(){
            System.out.println("Stopping movie");
        }

        public String toString(){
            return title + ", " + duration + ", " + Arrays.toString(actors) + ", " + company + ", " + type;
        }
    }

