class RacketRunner{

    public static void main(String[] args) {

        Racket racket = new Racket(
                "Yonex",
                "Badminton",
                "Black",
                85.5,
                4999.99,
                "G4",
                "Carbon Fiber",
                675,
                true,
                "Professional"
        );

        System.out.println("Brand: " + racket.brand);
        System.out.println("Sport Type: " + racket.sportType);
        System.out.println("Color: " + racket.color);
        System.out.println("Weight: " + racket.weight);
        System.out.println("Price: " + racket.price);
        System.out.println("Grip Size: " + racket.gripSize);
        System.out.println("Material: " + racket.material);
        System.out.println("Length: " + racket.length);
        System.out.println("Is Strung: " + racket.isStrung);
        System.out.println("Player Level: " + racket.playerLevel);
    }
}