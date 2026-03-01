class StandRunner{

    public static void main(String[] args) {

        Stand stand1 = new Stand( "Laptop Stand", "Adjustable", "Aluminium", "Silver", "AmazonBasics", "LS-01", "Rectangular", "Laptop Support",
            "India", "1 Year", 15.5, 25.0, 1.2, 1299.00,5, 8, 2025, true, true, false);
        stand1.type();

        Stand stand2 = new Stand("Mobile Stand", "Foldable", "Plastic", "Black","Boat", "MS-02", "Compact", "Mobile Holder",
            "China", "6 Months",10.0, 8.0, 0.3, 299.00,1, 7, 2024,true, false, false);
        stand2.type();

        Stand stand3 = new Stand("TV Stand", "Fixed", "Wood", "Brown","Ikea", "TV-03", "Wide", "TV Support",
            "Sweden", "2 Years",60.0, 120.0, 20.0, 7999.00,50, 9, 2025,false, false, false);
        stand3.type();

        Stand stand4 = new Stand("Camera Stand", "Adjustable", "Steel", "Black","Canon", "CS-04", "Tripod", "Photography",
            "Japan", "1 Year",140.0, 50.0, 2.5, 3499.00,10, 9, 2025,true, true, true);
        stand4.type();

        Stand stand5 = new Stand("Book Stand", "Portable", "Wood", "White","Classmate", "BS-05", "Slanted", "Reading",
            "India", "1 Year",30.0, 25.0, 1.0, 899.00,5, 8, 2023,true, true, false);
        stand5.type();

        Stand stand6 = new Stand("Mic Stand", "Height Adjustable", "Metal", "Black","Yamaha", "MS-06", "Round Base", "Music",
            "USA", "2 Years",150.0, 40.0, 3.0, 4599.00,8, 9, 2025,false, true, false);
        stand6.type();

        Stand stand7 = new Stand("Flower Stand", "Decorative", "Iron", "Golden","HomeDecor", "FS-07", "Spiral", "Decoration",
            "India", "6 Months",45.0, 30.0, 2.0, 1999.00,15, 7, 2024,false, false, true);
        stand7.type();

        Stand stand8 = new Stand("Tablet Stand", "Rotatable", "Plastic", "Grey","Logitech", "TS-08", "Slim", "Tablet Support",
            "China", "1 Year",12.0, 20.0, 0.5, 699.00,2, 8, 2025,true, true, false);
        stand8.type();

        Stand stand9 = new Stand("Projector Stand", "Heavy Duty", "Steel", "Black","BenQ", "PS-09", "Wide Base", "Projector Support",
            "Germany", "2 Years",100.0, 60.0, 8.0, 5999.00,25, 9, 2025,false, true, false);
        stand9.type();

        Stand stand10 = new Stand("Monitor Stand", "Ergonomic", "Aluminium", "Space Grey","Dell", "MS-10", "Modern", "Monitor Support",
            "USA", "3 Years",20.0, 35.0, 1.8, 2499.00,7, 9, 2025,false, true, false);
        stand10.type();
    }
}