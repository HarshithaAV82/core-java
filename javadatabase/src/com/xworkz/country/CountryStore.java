package com.xworkz.country;

public class CountryStore {

    State[] states;
    City[] cities;
    Collector[] collectors;
    Country[] countries;
    int currentIndex;

    public CountryStore(State[] states, City[] cities, Collector[] collectors, Country[] countries) {
        this.states = states;
        this.cities = cities;
        this.collectors = collectors;
        this.countries = countries;
    }

    public void saveCountry(Country country) {
        System.out.println("executing saveCountry in country store....");
        if (this.countries != null && country != null) {
            int index = this.countries.length - 1;
            if (currentIndex <= index) {
                this.countries[currentIndex] = country;
                System.out.println("Country saved: " + country.name);
                currentIndex++;
            } else {
                System.out.println("array is full..");
            }
        } else {
            System.out.println("Country or array is null...");
        }
    }

    public State findStateByStateName(String stateName) {
        if (this.states != null && stateName != null) {
            for (State state : this.states) {
                if (state != null) {
                    System.out.println("State is not null...");
                    if (state.name.equals(stateName)) {
                        state.stateInfo();
                        System.out.println("State found: " + state.name);
                        return state;
                    }
                }
            }
        }
        return null;
    }

    public City[] findAllCityByStateName(String stateName) {
        if (stateName != null) {
            for (State state : this.states) {
                if (state != null) {
                    System.out.println("Checking state...");
                    if (state.name.equals(stateName)) {
                        System.out.println("print the cities...");
                        return state.cities;
                    }
                }
            }
        }
        return null;
    }

    public int findNoOfDistrictsByCityName(String cityName) {
        if (cityName != null) {
            for (City city : this.cities) {
                if (city != null) {
                    System.out.println("City is not null.....");
                    if (city.name.equals(cityName)) {
                        System.out.println("City found: " + city.name);
                        return city.noOfDistricts;
                    }
                }
            }
        }
        return 0;
    }

    public Country findByCollectorName(String collectorName) {
        if (collectorName != null) {
            for (Collector collector : this.collectors) {
                if (collector != null) {
                    System.out.println("Collector is not null...");
                    if (collector.name.equals(collectorName)) {
                        System.out.println("Collector found: " + collector.name);

                        for (Country country : this.countries) {
                            if (country != null) {
                                return country;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public Country findByName(String countryName) {
        if (countryName != null) {
            for (Country country : this.countries) {
                if (country != null) {
                    System.out.println("Checking country...");
                    if (country.name.equals(countryName)) {
                        System.out.println("Country found: " + country.name);
                        return country;
                    }
                }
            }
        }
        return null;
    }
}