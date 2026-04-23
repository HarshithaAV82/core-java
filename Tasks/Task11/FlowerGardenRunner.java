class FlowerGardenRunner {

    public static void main(String[] args) {

        FlowerGarden flower1 = new FlowerGarden();
        System.out.println("Default Flower Name: " + flower1.flowerName);
        System.out.println("Default Color: " + flower1.color);
        System.out.println("Default Price: " + flower1.price);
        System.out.println("Default Season: " + flower1.season);
        flower1.flowerName = "Rose";
        flower1.color = "Red";
        flower1.price = 25.5;
        flower1.season = "Winter";
        System.out.println("After re-initialization");
        System.out.println("Flower Name: " + flower1.flowerName);
        System.out.println("Color: " + flower1.color);
        System.out.println("Price: " + flower1.price);
        System.out.println("Season: " + flower1.season);

        FlowerGarden flower2 = new FlowerGarden();
        System.out.println("Default Flower Name: " + flower2.flowerName);
        System.out.println("Default Color: " + flower2.color);
        System.out.println("Default Price: " + flower2.price);
        System.out.println("Default Season: " + flower2.season);
        flower2.flowerName = "Lily";
        flower2.color = "White";
        flower2.price = 30.0;
        flower2.season = "Spring";
        System.out.println("After re-initialization");
        System.out.println("Flower Name: " + flower2.flowerName);
        System.out.println("Color: " + flower2.color);
        System.out.println("Price: " + flower2.price);
        System.out.println("Season: " + flower2.season);

		FlowerGarden flower3 = new FlowerGarden();
		System.out.println("Default Flower Name: " + flower3.flowerName);
		System.out.println("Default Color: " + flower3.color);
		System.out.println("Default Price: " + flower3.price);
		System.out.println("Default Season: " + flower3.season);
		flower3.flowerName = "Tulip";
		flower3.color = "Yellow";
		flower3.price = 18.5;
		flower3.season = "Spring";
		System.out.println("After re-initialization");
		System.out.println("Flower Name: " + flower3.flowerName);
		System.out.println("Color: " + flower3.color);
		System.out.println("Price: " + flower3.price);
		System.out.println("Season: " + flower3.season);

		FlowerGarden flower4 = new FlowerGarden();
		System.out.println("Default Flower Name: " + flower4.flowerName);
		System.out.println("Default Color: " + flower4.color);
		System.out.println("Default Price: " + flower4.price);
		System.out.println("Default Season: " + flower4.season);
		flower4.flowerName = "Sunflower";
		flower4.color = "Golden";
		flower4.price = 22.0;
		flower4.season = "Summer";
		System.out.println("After re-initialization");
		System.out.println("Flower Name: " + flower4.flowerName);
		System.out.println("Color: " + flower4.color);
		System.out.println("Price: " + flower4.price);
		System.out.println("Season: " + flower4.season);

		FlowerGarden flower5 = new FlowerGarden();
		System.out.println("Default Flower Name: " + flower5.flowerName);
		System.out.println("Default Color: " + flower5.color);
		System.out.println("Default Price: " + flower5.price);
		System.out.println("Default Season: " + flower5.season);
		flower5.flowerName = "Orchid";
		flower5.color = "Purple";
		flower5.price = 35.7;
		flower5.season = "Rainy";
		System.out.println("After re-initialization");
		System.out.println("Flower Name: " + flower5.flowerName);
		System.out.println("Color: " + flower5.color);
		System.out.println("Price: " + flower5.price);
		System.out.println("Season: " + flower5.season);

    }
}
