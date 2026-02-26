class BatteryRunner{

    public static void main(String[] args) {

        Battery battery = new Battery("Duracell", "AA", 2500.0, 1.5, false);
        System.out.println("Brand: " + battery.brand);
        System.out.println("Type: " + battery.type);
        System.out.println("Capacity: " + battery.capacity);
        System.out.println("Voltage: " + battery.voltage);
        System.out.println("Is Rechargeable: " + battery.isRechargeable);

        Battery battery1 = new Battery("Eveready");
        System.out.println("Brand: " + battery1.brand);

        Battery battery2 = new Battery("AAA", 2000.0);
        System.out.println("Type: " + battery2.type);
        System.out.println("Capacity: " + battery2.capacity);

        Battery battery3 = new Battery(9.0, true);
        System.out.println("Voltage: " + battery3.voltage);
        System.out.println("Is Rechargeable: " + battery3.isRechargeable);

        Battery battery4 = new Battery("Lithium", 3000.0, 3.7);
        System.out.println("Type: " + battery4.type);
        System.out.println("Capacity: " + battery4.capacity);
        System.out.println("Voltage: " + battery4.voltage);

        Battery battery5 = new Battery();
        System.out.println("Brand: " + battery5.brand);
        System.out.println("Type: " + battery5.type);
        System.out.println("Capacity: " + battery5.capacity);
        System.out.println("Voltage: " + battery5.voltage);
        System.out.println("Is Rechargeable: " + battery5.isRechargeable);
    }
}