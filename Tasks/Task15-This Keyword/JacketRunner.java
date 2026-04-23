class JacketRunner{

    public static void main(String[] args) {

        Jacket jacket = new Jacket("Nike", "Black", "M", 2999.99, true);

        System.out.println("Jacket Brand: " + jacket.brand);
        System.out.println("Jacket Color: " + jacket.color);
        System.out.println("Jacket Size: " + jacket.size);
        System.out.println("Jacket Price: " + jacket.price);
        System.out.println("Jacket Waterproof: " + jacket.isWaterproof);
    }
}