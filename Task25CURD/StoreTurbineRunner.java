class StoreTurbineRunner{

    public static void main(String[] args){

        String[] turbines = new String[10];
        StoreTurbine store = new StoreTurbine(turbines);

        store.getTurbineName("GasTurbine");
        store.getTurbineName("SteamTurbine");
        store.getTurbineName("WindTurbine");
        store.getTurbineName("HydraulicTurbine");

        System.out.println(store.searchTurbineName("GasTurbine"));
        System.out.println(store.searchTurbineName("MegaTurbine"));

        store.update(1, "MegaTurbine");
        store.update("UltraTurbine", "WindTurbine");

        store.delete(2);
        store.delete("HydraulicTurbine");
    }
}