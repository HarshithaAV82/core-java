package com.xworkz.country;

public class District {
    String name;
    Collector collector;

    public District(String name, Collector collector) {
        this.name = name;
        this.collector = collector;
    }
    public void districtInfo(){
        System.out.println("District Name:"+this.name);
        collector.collectorInfo();
    }
}
