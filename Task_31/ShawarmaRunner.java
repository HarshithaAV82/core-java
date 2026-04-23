class ShawarmaRunner{

    public static void main(String[] args) {

        RestaurantShawarma Shawarma = new RestaurantShawarma();
        System.out.println(Shawarma.type);
        System.out.println(Shawarma.price);
        System.out.println(Shawarma.isSpicy);
       
        RestaurantShawarma Shawarma1 = new RestaurantShawarma("Paneer");
        System.out.println(Shawarma1.type);
        System.out.println(Shawarma1.price);
        System.out.println(Shawarma1.isSpicy);
      
	  
        RestaurantShawarma Shawarma2 = new RestaurantShawarma("Veg", 100.0, false);
        System.out.println(Shawarma2.type);
        System.out.println(Shawarma2.price);
        System.out.println(Shawarma2.isSpicy);
    }
}