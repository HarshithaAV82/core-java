package com.xworkz.Movie;

public class MovieRunner{
        public static void main(String[] args){



            MovieCompany company = new MovieCompany("Hombale Films", "India");
            String[] actors = {"Yash", "Sanjay Dutt"};

            Movie movie = new Movie("KGF", 180, actors, company, MovieType.ACTION);
            movie.play();
            movie.stop();
            System.out.println(movie);

            Cinimea cinimea = new Cinimea("KGF 2", 170, actors, company, MovieType.ACTION, 9, true);
            cinimea.play();
            cinimea.stop();
            System.out.println(cinimea);
        }
    }

