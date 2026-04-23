class PepperRunner {

    public static void main(String[] args) {

        Pepper pepper1 = new Pepper("Black Pepper","Eastern Malabar","India","Whole",
            299.50,200,"Sealed Pouch", true,true,true,"Strong, Pungent, Earthy",8,
            "2025","12-2027","Store in cool dry place",
            "Black",11.5,"Premium Grade A",500,"FSSAI Certified");
        pepper1.displayInformation();

        Pepper pepper2 = new Pepper("White Pepper","Kerala Spices","India","Powder",
            349.00,150,"Bottle",true,true,true,"Mild, Smooth",6,"2025","10-2027","Keep airtight",
			"White",10.0,"Grade A",300,"ISO Certified");
        pepper2.displayInformation();

        Pepper pepper3 = new Pepper("Green Pepper","Fresh Farms","Vietnam","Whole", 279.00,250,"Plastic Pack",
		false,true,true,"Fresh, Herbal",5,
            "2024","08-2026","Refrigerate","Green",12.0,"Grade B",200,"Organic Certified");
        pepper3.displayInformation();

        Pepper pepper4 = new Pepper("Pink Pepper","Spice World","Brazil","Whole",399.00,100,"Glass Jar",
            true,true,false,"Sweet, Fruity",4,"2025","11-2027","Cool place","Pink",9.5,"Premium",150,"FSSAI Certified");
        pepper4.displayInformation();

        Pepper pepper5 = new Pepper("Black Pepper","Everest","India","Powder",199.00,100,"Box",false,true,true,"Strong Aroma",7,
            "2025","09-2026","Dry place","Dark Black",11.0,"Standard",600,"ISI Certified");
        pepper5.displayInformation();

        Pepper pepper6 = new Pepper(
            "Sichuan Pepper","China Spice","China","Whole",499.00,120,"Vacuum Pack",
            true,true,true,"Citrusy, Numbing",9,"2025","01-2028","Sealed container",
            "Reddish Brown",8.0,"Export Quality",180,"Organic Certified");
        pepper6.displayInformation();

        Pepper pepper7 = new Pepper(
            "Black Pepper","Catch","India","Powder",
          159.00,100,"Plastic Jar",false,true,true,"Hot and Sharp",7,
            "2025","12-2026","Dry storage","Black",10.5,"Grade A",450,"FSSAI Certified");
        pepper7.displayInformation();

        Pepper pepper8 = new Pepper("Tellicherry Pepper","Malabar Gold","India","Whole",
            549.00,250,"Premium Pack",true,true,true,"Rich and Bold",9,
            "2025","03-2028","Cool dry area","Deep Black",12.5,"Premium Export",120,"ISO Certified");
        pepper8.displayInformation();

        Pepper pepper9 = new Pepper(
            "Green Pepper","Nature Fresh","Thailand","Powder",
            320.00,180,"Bottle",true,true,false,"Light and Fresh",5,
           "2024","07-2026","Refrigerate", "Light Green",10.2,"Standard",210,"Organic Certified");
        pepper9.displayInformation();

        Pepper pepper10 = new Pepper("White Pepper","Urban Spices","Indonesia","Whole",
            380.00,200,"Sealed Pack",true,true,true,"Smooth and Mild",6,
         "2025","05-2027","Airtight container","Cream White",9.8,"Grade A",340,"FSSAI Certified");
        pepper10.displayInformation();
    }
}