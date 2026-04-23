class BiscuitRunner {

    public static void main(String[] args) {
        
		String name = "Parle-g";
		
        int cost = Biscuit.getCost(name);
        System.out.println("Biscuit Cost: " + cost);

      
        String shape = Biscuit.getShape(name);
        System.out.println("Biscuit Shape: " + shape);

       
        String flavor = Biscuit.getFlavor(name);
        System.out.println("Biscuit Flavor: " + flavor);
    }
}
