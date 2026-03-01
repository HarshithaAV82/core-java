class ConditionerRunner{

    public static void main(String[] args) {

        Conditioner conditioner1 = new Conditioner("Dove","Dry","Mild","White",
            "Keratin","Bottle","India","Daily","Creamy","C101",
            240,180,5.5,4.5,24,100,2024,true,true,true);
        conditioner1.printDetails();

        Conditioner conditioner2 = new Conditioner("Pantene","Normal","Floral","Pink",
            "Pro-V","Bottle","India","Daily","Smooth","C102",
            220,200,5.6,4.2,24,90,2024,false,true,true);
        conditioner2.printDetails();

        Conditioner conditioner3 = new Conditioner("Tresemme","Damaged","Soft","Black",
            "Keratin","Bottle","USA","Weekly","Thick","C103",
            480,250,5.8,4.7,36,60,2023,false,true,true);
        conditioner3.printDetails();

        Conditioner conditioner4 = new Conditioner("L'Oreal","Dry","Rose","Gold",
            "Argan Oil","Bottle","France","Weekly","Cream","C104",
            450,200,5.7,4.6,36,70,2023,false,true,true);
        conditioner4.printDetails();

        Conditioner conditioner5 = new Conditioner("Himalaya","Oily","Herbal","Green",
            "Neem","Bottle","India","Daily","Light","C105",
            210,180,5.3,4.3,24,110,2024,true,true,true);
        conditioner5.printDetails();

        Conditioner conditioner6 = new Conditioner("WOW","Hairfall","Strong","Purple",
            "Onion Oil","Bottle","India","Daily","Thick","C106",
            350,200,5.5,4.5,24,75,2024,true,true,true);
        conditioner6.printDetails();

        Conditioner conditioner7 = new Conditioner("Sunsilk","Normal","Rose","Pink",
            "Protein","Bottle","India","Daily","Smooth","C107",
            190,170,5.4,4.1,24,95,2023,false,true,false);
        conditioner7.printDetails();

        Conditioner conditioner8 = new Conditioner("Garnier","Oily","Citrus","Orange",
            "Fruit Extract","Bottle","USA","Alternate","Light","C108",
            280,185,5.6,4.2,24,85,2024,false,true,true);
        conditioner8.printDetails();

        Conditioner conditioner9 = new Conditioner("Clinic Plus","All","Milk","Blue",
            "Milk Protein","Bottle","India","Daily","Creamy","C109",
            180,175,5.4,4.0,24,120,2024,false,true,false);
        conditioner9.printDetails();

        Conditioner conditioner10 = new Conditioner("Biotique","Dry","Herbal","Green",
            "Bhringraj","Bottle","India","Daily","Natural","C110",
            300,190,5.2,4.4,24,80,2024,true,true,true);
        conditioner10.printDetails();
    }
}