class DumbBellRunner{

    public static void main(String[] args) {

        DumbBell dumbBell1 = new DumbBell("Nike","Fixed","Iron","Black",
            "Round","Knurled","Rubber","Gym","USA","DB101",10.0,2500.0,30.0,3.0,50,2,5,false,true,true);
        dumbBell1.printDetails();

        DumbBell dumbBell2 = new DumbBell("Adidas","Adjustable","Steel","Silver",
            "Hex","Smooth","Chrome","Home","Germany","DB102",15.0,3500.0,35.0,3.5,40,3,4,true,false,true);
        dumbBell2.printDetails();

        DumbBell dumbBell3 = new DumbBell("Reebok","Fixed","Iron","Red",
            "Round","Textured","Rubber","Gym","UK","DB103",5.0,1500.0,25.0,2.5,60,1,4,false,true,true);
        dumbBell3.printDetails();

        DumbBell dumbBell4 = new DumbBell("Puma","Adjustable","Steel","Blue",
            "Hex","Knurled","Matte","Home","USA","DB104",20.0,4500.0,40.0,4.0,30,2,5,true,true,true);
        dumbBell4.printDetails();

        DumbBell dumbBell5 = new DumbBell("ProFit","Fixed","Iron","Grey",
            "Round","Smooth","Rubber","Gym","India","DB105",12.5,2800.0,32.0,3.2,45,2,4,false,true,false);
        dumbBell5.printDetails();

        DumbBell dumbBell6 = new DumbBell("Flexi","Adjustable","Steel","Black",
            "Hex","Textured","Chrome","Home","China","DB106",25.0,5500.0,45.0,4.5,20,3,5,true,false,true);
        dumbBell6.printDetails();

        DumbBell dumbBell7 = new DumbBell("BodyStrong","Fixed","Iron","Green",
            "Round","Knurled","Rubber","Gym","USA","DB107",7.5,1800.0,28.0,2.8,55,1,4,false,true,true);
        dumbBell7.printDetails();

        DumbBell dumbBell8 = new DumbBell("PowerMax","Adjustable","Steel","Orange",
            "Hex","Smooth","Matte","Home","India","DB108",30.0,6500.0,50.0,5.0,15,4,5,true,true,true);
        dumbBell8.printDetails();

        DumbBell dumbBell9 = new DumbBell("FitLife","Fixed","Iron","Yellow",
            "Round","Textured","Rubber","Gym","UK","DB109",8.0,2000.0,29.0,3.0,48,2,4,false,true,false);
        dumbBell9.printDetails();

        DumbBell dumbBell10 = new DumbBell("MusclePro","Adjustable","Steel","Black",
            "Hex","Knurled","Chrome","Home","USA","DB110",35.0,7500.0,55.0,5.5,10,5,5,true,true,true);
        dumbBell10.printDetails();
    }
}