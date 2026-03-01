class ShampooRunner{

    public static void main(String[] args) {

        Shampoo shampoo1 = new Shampoo("Dove","Anti Hairfall","Mild","White",
            "Dry","Keratin","Bottle","India","SH101","Daily",
            250,180,5.5,4.5,24,100,2024,true,true,true);
        shampoo1.printDetails();

        Shampoo shampoo2 = new Shampoo("Pantene","Smooth","Floral","Pink",
            "Normal","Pro-V","Bottle","India","SH102","Daily",
            220,200,5.6,4.2,24,90,2024,false,true,true);
        shampoo2.printDetails();

        Shampoo shampoo3 = new Shampoo("Head & Shoulders","Anti Dandruff","Fresh","Blue",
            "Oily","Zinc","Bottle","USA","SH103","Alternate",
            300,190,5.7,4.4,24,80,2023,false,false,true);
        shampoo3.printDetails();

        Shampoo shampoo4 = new Shampoo("Clinic Plus","Strong","Herbal","Green",
            "All","Milk Protein","Bottle","India","SH104","Daily",
            180,175,5.4,4.0,24,120,2024,true,true,false);
        shampoo4.printDetails();

        Shampoo shampoo5 = new Shampoo("L'Oreal","Repair","Floral","Gold",
            "Damaged","Argan Oil","Bottle","France","SH105","Weekly",
            450,200,5.8,4.6,36,70,2023,false,true,true);
        shampoo5.printDetails();

        Shampoo shampoo6 = new Shampoo("Tresemme","Keratin","Soft","Black",
            "Dry","Keratin","Bottle","USA","SH106","Daily",
            500,250,5.6,4.7,36,60,2024,false,true,true);
        shampoo6.printDetails();

        Shampoo shampoo7 = new Shampoo("Himalaya","Herbal","Neem","Green",
            "Oily","Neem","Bottle","India","SH107","Daily",
            210,180,5.3,4.3,24,110,2024,true,true,true);
        shampoo7.printDetails();

        Shampoo shampoo8 = new Shampoo("WOW","Onion","Strong","Purple",
            "Hairfall","Onion Oil","Bottle","India","SH108","Daily",
            350,200,5.5,4.5,24,75,2024,true,true,true);
        shampoo8.printDetails();

        Shampoo shampoo9 = new Shampoo("Sunsilk","Smooth","Rose","Pink",
            "Normal","Protein","Bottle","India","SH109","Daily",
            190,170,5.4,4.1,24,95,2023,false,true,false);
        shampoo9.printDetails();

        Shampoo shampoo10 = new Shampoo("Garnier","Fructis","Citrus","Orange",
            "Oily","Fruit Extract","Bottle","USA","SH110","Alternate",
            280,185,5.6,4.2,24,85,2024,false,true,true);
        shampoo10.printDetails();
    }
}