class ClipRunner{

    public static void main(String[] args) {

        Clip clip = new Clip("Steel", "Silver", 25.0, 5.5, true);
        System.out.println("Material: " + clip.material);
        System.out.println("Color: " + clip.color);
        System.out.println("Price: " + clip.price);
        System.out.println("Size: " + clip.size);
        System.out.println("Is Metal: " + clip.isMetal);

        Clip clip1 = new Clip("Plastic");
        System.out.println("Material: " + clip1.material);

        Clip clip2 = new Clip("Black", 10.0);
        System.out.println("Color: " + clip2.color);
        System.out.println("Price: " + clip2.price);

        Clip clip3 = new Clip(4.0, false);
        System.out.println("Size: " + clip3.size);
        System.out.println("Is Metal: " + clip3.isMetal);

        Clip clip4 = new Clip("Blue", 15.0, 6.0);
        System.out.println("Color: " + clip4.color);
        System.out.println("Price: " + clip4.price);
        System.out.println("Size: " + clip4.size);

        Clip clip5 = new Clip();
        System.out.println("Material: " + clip5.material);
        System.out.println("Color: " + clip5.color);
        System.out.println("Price: " + clip5.price);
        System.out.println("Size: " + clip5.size);
        System.out.println("Is Metal: " + clip5.isMetal);
    }
}