package com.xworkz.country;

public class CountryRunner {
    public static void main(String[] args) {

        Collector collector = new Collector("Ravi", 2014);
        Collector collector1 = new Collector("Anita", 2016);

        Collector[] collectors = {collector, collector1};

        District district = new District("Mysuru", collector);
        District district1 = new District("Udupi", collector1);

        District[] districts1 = {district};
        District[] districts2 = {district1};

        City city = new City("MysuruCity", 1, districts1);
        City city1 = new City("UdupiCity", 1, districts2);

        City[] cities = {city, city1};

        State state = new State("Karnataka", 6.9, cities);
        State state1 = new State("Kerala", 3.5, cities);

        State[] states = {state, state1};

        Country[] countries = new Country[10];

        CountryStore countryStore = new CountryStore(states, cities, collectors, countries);

        Country country = new Country("India", "President1", states);
        Country country1 = new Country("Japan", "President2", states);

        countryStore.saveCountry(country);
        countryStore.saveCountry(country1);

        countryStore.findByName("India");
        countryStore.findStateByStateName("Karnataka");
        countryStore.findAllCityByStateName("Karnataka");
        countryStore.findNoOfDistrictsByCityName("MysuruCity");
        countryStore.findByCollectorName("Ravi");
    }
}