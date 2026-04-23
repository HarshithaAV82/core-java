class NecklaceRunner{

    public static void main(String[] args) {

        Necklace necklace = new Necklace(
                "Malabar Gold",
                "Gold",
                "Yellow",
                75999.99,
                35.8,
                "18 inches",
                true,
                "Traditional",
                "Emerald",
                15,
                "Hook",
                true,
                "Women",
                "Wedding",
                "India",
                24,
                "Glossy",
                true,
                "NK2026A",
                5
        );

        System.out.println("Brand: " + necklace.brand);
        System.out.println("Material: " + necklace.material);
        System.out.println("Color: " + necklace.color);
        System.out.println("Price: " + necklace.price);
        System.out.println("Weight: " + necklace.weight);
        System.out.println("Length: " + necklace.length);
        System.out.println("Adjustable: " + necklace.isAdjustable);
        System.out.println("Design Type: " + necklace.designType);
        System.out.println("Stone Type: " + necklace.stoneType);
        System.out.println("Number of Stones: " + necklace.numberOfStones);
        System.out.println("Clasp Type: " + necklace.claspType);
        System.out.println("Waterproof: " + necklace.isWaterproof);
        System.out.println("Gender: " + necklace.gender);
        System.out.println("Occasion: " + necklace.occasion);
        System.out.println("Country Of Origin: " + necklace.countryOfOrigin);
        System.out.println("Warranty Months: " + necklace.warrantyMonths);
        System.out.println("Finish Type: " + necklace.finishType);
        System.out.println("Handmade: " + necklace.isHandmade);
        System.out.println("Model Number: " + necklace.modelNumber);
        System.out.println("Rating: " + necklace.rating);
    }
}