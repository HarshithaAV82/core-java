class StoreScooterRunner{

    public static void main(String[] args){

        String[] scooters = new String[10];
        StoreScooter store = new StoreScooter(scooters);

        store.getScooterName("Activa");
        store.getScooterName("Jupiter");
        store.getScooterName("Access");
        store.getScooterName("Fascino");

        
        System.out.println("\nSearch:");
        System.out.println(store.searchScooterName("Activa")); 
        System.out.println(store.searchScooterName("Dio"));    

       
        System.out.println("\nUpdate:");
        store.update(1, "Dio"); 
        store.update("RayZR", "Access");

        System.out.println("\nDelete:");
        store.delete(2); 
        store.delete("Fascino"); 
    }
}