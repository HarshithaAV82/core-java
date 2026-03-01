class MapRunner{

    public static void main(String[] args) {

        Map map1 = new Map("World Political Map","Political","Global","Multiple","All Continents","English","Mercator",
            "National Geographic","1:50M","Multicolor",120.0,80.0,1.5,999.00,2025,195,250,true,false,true);
        map1.show();

        Map map2 = new Map("India Map","Political","Asia","India","Asia","English","Mercator",
            "Survey of India","1:25M","Color",100.0,70.0,1.2,499.00,2024,28,28,true,false,false);
        map2.show();

        Map map3 = new Map("USA Physical Map","Physical","North America","USA","North America","English","Robinson",
            "USGS","1:30M","Blue-Green",110.0,75.0,1.3,799.00,2023,50,50,false,true,true);
        map3.show();

        Map map4 = new Map("Europe Map","Political","Europe","Multiple",
            "Europe","English","Mercator", "Euro Maps","1:40M","Multicolor",115.0,78.0,1.4,899.00,2025,44,44,true,false,true);
        map4.show();

        Map map5 = new Map("Asia Map","Political","Asia","Multiple",
            "Asia","English","Mercator","Asia Publisher","1:60M","Color",130.0,85.0,1.6,1099.00,2025,48,48,true,false,false);
        map5.show();

        Map map6 = new Map("Africa Physical Map","Physical","Africa","Multiple",
            "Africa","English","Robinson","Geo Africa","1:45M","Earth Tone",125.0,82.0,1.45,950.00, 2024,54,54, false,true,false);
        map6.show();

        Map map7 = new Map("Australia Map","Political","Oceania","Australia",
            "Oceania","English","Mercator", "AUS Geo","1:20M","Bright",90.0,60.0,1.1,450.00,2025,8,8,true,false,true);
        map7.show();

        Map map8 = new Map("South America Map","Physical","South America","Multiple","South America","Spanish","Robinson",
            "SA Maps","1:35M","Green-Blue", 118.0,76.0,1.35,870.00,2024,12,12,false,true,true);
        map8.show();

        Map map9 = new Map("Antarctica Map","Scientific","Antarctica","None",
            "Antarctica","English","Polar", "Research Geo","1:15M","White-Blue", 80.0,50.0,1.0,650.00,2023,0,0, false,true,false);
        map9.show();

        Map map10 = new Map("City Road Map","Road","Urban","India",
            "Asia","English","Mercator", "City Publisher","1:10M","Detailed", 60.0,40.0,0.8,299.00, 2025,150,20, false,false,true);
        map10.show();
    }
}