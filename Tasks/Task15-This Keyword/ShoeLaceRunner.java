class ShoeLaceRunner{

    public static void main(String[] args) {

        ShoeLace shoeLace = new ShoeLace(
                "Nike",
                "White",
                110.0,
                "Nylon",
                149.99,
                false,
                "Striped",
                "Casual",
                "India",
                5
        );

        System.out.println("Brand: " + shoeLace.brand);
        System.out.println("Color: " + shoeLace.color);
        System.out.println("Length: " + shoeLace.length);
        System.out.println("Material: " + shoeLace.material);
        System.out.println("Price: " + shoeLace.price);
        System.out.println("Elastic: " + shoeLace.isElastic);
        System.out.println("Pattern: " + shoeLace.pattern);
        System.out.println("Type: " + shoeLace.shoeType);
        System.out.println("Country: " + shoeLace.countryOfOrigin);
        System.out.println("Durability: " + shoeLace.durabilityRating);
    }
}