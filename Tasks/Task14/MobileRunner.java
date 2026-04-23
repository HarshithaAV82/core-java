class MobileRunner {

    public static void main(String[] args) {
        
		String name = "iPhone 14";
		
        int price = Mobile.getPrice(name);
        System.out.println("Mobile Price: " + price);

       
        String brand = Mobile.getBrand(name);
        System.out.println("Mobile Brand: " + brand);

       
        String os = Mobile.getOS(name);
        System.out.println("Mobile OS: " + os);
    }
}
