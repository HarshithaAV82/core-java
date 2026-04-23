package com.xworkz.nation;

public class CountryStore {

    Country[] countries;
    int currentIndex;

    public CountryStore(Country[] countries) {
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
        for (Country country : countries) {
            if (country != null && country.states != null) {

                for (State state : country.states) {
                    if (state != null && state.name.equals(stateName)) {
                        System.out.println("State found: " + state.name);
                        return state;
                    }
                }
            }
        }
        return null;
    }

    public City[] findAllCityByStateName(String stateName) {
        State state = findStateByStateName(stateName);
        if (state != null) {
            for (City city : state.cities) {
                if (city != null) {
                    System.out.println("City: " + city.name);
                }
            }
            return state.cities;
        }
        return null;
    }

    public int findNoOfDistrictsByCityName(String cityName) {
        for (Country country : countries) {
            if (country != null) {
                for (State state : country.states) {
                    if (state != null) {
                        for (City city : state.cities) {
                            if (city != null && city.name.equals(cityName)) {
                                return city.noOfDistricts;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public Country findByCollectorName(String collectorName) {
        for (Country country : countries) {
            if (country != null) {
                for (State state : country.states) {
                    if (state != null) {
                        for (City city : state.cities) {
                            if (city != null) {
                                for (District district : city.districtNames) {
                                    if (district != null && district.collector != null &&
                                            district.collector.name.equals(collectorName)) {
                                        return country;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public Country findByName(String countryName) {
        for (Country country : countries) {
            if (country != null && country.name.equals(countryName)) {
                return country;
            }
        }
        return null;
    }
}