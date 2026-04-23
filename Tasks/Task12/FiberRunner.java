class FiberRunner{
	
	public static void main(String[] args){
		
		Fiber fiber = new Fiber();
	    fiber.name = "Broadband Fiber";
		fiber.length = 6;
		fiber.vendors = new String[]{"Airtel", "Jio", "ACT", "BSNL"};
		System.out.println("The fiber name is:" +fiber.name);
		System.out.println("The length of the fiber is:" + fiber.length);
		System.out.println("The vendors name are:");
        for(int i = 0; i < fiber.vendors.length; i++) {
           System.out.println(fiber.vendors[i]);
             }
		
		Fiber fiber1 = new Fiber();
	    fiber1.name = "Metro Fiber Line";
		fiber1.length = 10;
        fiber1.vendors = new String[]{"BSNL", "Tata Play", "Hathway"};
		System.out.println("The fiber name is:" +fiber1.name);
		System.out.println("The length of the fiber is:" + fiber1.length);
		System.out.println("The vendors name are:");
        for(int i = 0; i < fiber1.vendors.length; i++) {
            System.out.println(fiber1.vendors[i]);
              }

		}
}