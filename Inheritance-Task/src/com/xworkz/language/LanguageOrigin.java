package com.xworkz.language;

public class LanguageOrigin{

    String originCountry;
    int year;

    public LanguageOrigin(String originCountry, int yearCreated){
        this.originCountry = originCountry;
        this.year = yearCreated;
        System.out.println("Origin Country: " + this.originCountry);
        System.out.println("Year Created: " + this.year);
    }

    @Override
    public String toString(){
        return "Origin Country: " + originCountry + ", Year Created: " + year;
    }
}
