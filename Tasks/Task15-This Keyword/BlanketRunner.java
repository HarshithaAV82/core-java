class BlanketRunner{

    public static void main(String[] args) {
        Blanket blanket = new Blanket(
                "Bombay Dyeing",
                "Blue",
                "Cotton",
                1999.99,
                2.5,
                true
        );
        System.out.println("Brand: " + blanket.brand);
        System.out.println("Color: " + blanket.color);
        System.out.println("Material: " + blanket.material);
        System.out.println("Price: " + blanket.price);
        System.out.println("Size: " + blanket.size);
        System.out.println("Washable: " + blanket.isWashable);
    }
}