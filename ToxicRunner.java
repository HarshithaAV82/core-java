class ToxicRunner{

    public static void main(String[] args) {

        Toxic toxic1 = new Toxic(
            "Sodium Cyanide", "Cyanide", "Poison", "Industrial","White", "Almond-like", "Solid", "Inhalation","Hydroxocobalamin", "High",
            9.5, 50.0,1496.0, 563.0,10, 1811, 365,false, false, true);
        toxic1.show();

        Toxic toxic2 = new Toxic(
            "Carbon Monoxide", "CO", "Gas", "Vehicle Emission",
            "Colorless", "Odorless", "Gas", "Inhalation",
            "Oxygen Therapy", "High",8.8, 35.0,-191.5, -205.0,9, 1776, 180,true, false, false);
        toxic2.show();

        Toxic toxic3 = new Toxic(
            "Arsenic", "White Arsenic", "Metalloid", "Mineral",
            "Gray", "Garlic-like", "Solid", "Ingestion",
            "Dimercaprol", "Very High",9.0, 30.0,613.0, 817.0,10, 1250, 400,false, false, true);
        toxic3.show();

        Toxic toxic4 = new Toxic(
            "Mercury", "Quick Silver", "Metal", "Natural",
            "Silver", "Metallic", "Liquid", "Skin Contact","Chelation", "High",
            8.5, 20.0,356.7, -38.8,9, 1500, 500,false, false, false);
        toxic4.show();

        Toxic toxic5 = new Toxic(
            "Chlorine", "Cl2", "Gas", "Industrial","Greenish", "Pungent", "Gas", "Inhalation",
            "Oxygen", "Medium",7.5, 45.0,-34.0, -101.5,8, 1774, 200,true, false, true);
        toxic5.show();

        Toxic toxic6 = new Toxic(
            "Lead", "Pb", "Metal", "Mining",
            "Blue-gray", "Odorless", "Solid", "Ingestion","EDTA", "High",8.0, 60.0,1749.0, 327.5,9, 7000, 600,false, false, true);
        toxic6.show();

        Toxic toxic7 = new Toxic(
            "Benzene", "Benzol", "Liquid", "Petroleum",
            "Colorless", "Sweet", "Liquid", "Inhalation","Supportive Care", "High",8.2, 70.0,80.1, 5.5,8, 1825, 365,true, false, false);
        toxic7.show();

        Toxic toxic8 = new Toxic(
            "Formaldehyde", "Methanal", "Chemical", "Industrial",
            "Colorless", "Strong", "Gas", "Inhalation","Ammonia Solution", "Medium",
            7.8, 55.0,-19.0, -92.0,7, 1859, 250,true, false, true);
        toxic8.show();

        Toxic toxic9 = new Toxic(
            "Ammonia", "NH3", "Gas", "Fertilizer",
            "Colorless", "Sharp", "Gas", "Inhalation","Water Wash", "Medium",6.5, 75.0,-33.3, -77.7,
            6, 1774, 150,true, false, true);
        toxic9.show();

        Toxic toxic10 = new Toxic(
            "Hydrogen Sulfide", "H2S", "Gas", "Sewage",
            "Colorless", "Rotten Egg", "Gas", "Inhalation","Oxygen Therapy", "High",9.2, 40.0,-60.0, -85.5,9, 1777, 180,true, false, true);
        toxic10.show();
    }
}