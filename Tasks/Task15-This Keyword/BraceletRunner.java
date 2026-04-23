class BraceletRunner{

    public static void main(String[] args) {

        Bracelet bracelet = new Bracelet(
                "Tanishq",
                "Gold",
                "Rose Gold",
                45999.99,
                25.5,
                "Medium",
                true,
                "Traditional",
                "Diamond",
                12,
                "Hook",
                true,
                "Women",
                "Wedding",
                "India",
                24,
                "Matte",
                true,
                "BR2026X",
                5
        );

        System.out.println("Brand: " + bracelet.brand);
        System.out.println("Material: " + bracelet.material);
        System.out.println("Color: " + bracelet.color);
        System.out.println("Price: " + bracelet.price);
        System.out.println("Weight: " + bracelet.weight);
        System.out.println("Size: " + bracelet.size);
        System.out.println("Adjustable: " + bracelet.isAdjustable);
        System.out.println("Design Type: " + bracelet.designType);
        System.out.println("Stone Type: " + bracelet.stoneType);
        System.out.println("Number of Stones: " + bracelet.numberOfStones);
        System.out.println("Clasp Type: " + bracelet.claspType);
        System.out.println("Waterproof: " + bracelet.isWaterproof);
        System.out.println("Gender: " + bracelet.gender);
        System.out.println("Occasion: " + bracelet.occasion);
        System.out.println("Country Of Origin: " + bracelet.countryOfOrigin);
        System.out.println("Warranty (Months): " + bracelet.warrantyMonths);
        System.out.println("Finish Type: " + bracelet.finishType);
        System.out.println("Handmade: " + bracelet.isHandmade);
        System.out.println("Model Number: " + bracelet.modelNumber);
        System.out.println("Rating: " + bracelet.rating);
    }
}