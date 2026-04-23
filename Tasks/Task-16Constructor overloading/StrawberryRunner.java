class StrawberryRunner{

    public static void main(String[] args) {

        Strawberry strawberry = new Strawberry("Red", "Sweet", 50.0, 200.0, true);
        System.out.println("Color: " + strawberry.color);
        System.out.println("Taste: " + strawberry.taste);
        System.out.println("Weight: " + strawberry.weight);
        System.out.println("Price: " + strawberry.price);
        System.out.println("Is Fresh: " + strawberry.isFresh);

        Strawberry strawberry1 = new Strawberry("Pink");
        System.out.println("Color: " + strawberry1.color);

        Strawberry strawberry2 = new Strawberry("Tangy", 45.0);
        System.out.println("Taste: " + strawberry2.taste);
        System.out.println("Weight: " + strawberry2.weight);

        Strawberry strawberry3 = new Strawberry(180.0, false);
        System.out.println("Price: " + strawberry3.price);
        System.out.println("Is Fresh: " + strawberry3.isFresh);

        Strawberry strawberry4 = new Strawberry("Juicy", 55.0, 220.0);
        System.out.println("Taste: " + strawberry4.taste);
        System.out.println("Weight: " + strawberry4.weight);
        System.out.println("Price: " + strawberry4.price);

        Strawberry strawberry5 = new Strawberry();
        System.out.println("Color: " + strawberry5.color);
        System.out.println("Taste: " + strawberry5.taste);
        System.out.println("Weight: " + strawberry5.weight);
        System.out.println("Price: " + strawberry5.price);
        System.out.println("Is Fresh: " + strawberry5.isFresh);
    }
}