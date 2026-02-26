class SnowRunner{

    public static void main(String[] args) {

        Snow snow = new Snow("Powder", -5.0, "Winter", 10.5, true);
        System.out.println("Type: " + snow.type);
        System.out.println("Temperature: " + snow.temperature);
        System.out.println("Season: " + snow.season);
        System.out.println("Thickness: " + snow.thickness);
        System.out.println("Is Frozen: " + snow.isFrozen);

        Snow snow1 = new Snow("Crystal");
        System.out.println("Type: " + snow1.type);

        Snow snow2 = new Snow(-2.5, "December");
        System.out.println("Temperature: " + snow2.temperature);
        System.out.println("Season: " + snow2.season);

        Snow snow3 = new Snow(5.0, false);
        System.out.println("Thickness: " + snow3.thickness);
        System.out.println("Is Frozen: " + snow3.isFrozen);

        Snow snow4 = new Snow("January", 8.0, true);
        System.out.println("Season: " + snow4.season);
        System.out.println("Thickness: " + snow4.thickness);
        System.out.println("Is Frozen: " + snow4.isFrozen);

        Snow snow5 = new Snow();
        System.out.println("Type: " + snow5.type);
        System.out.println("Temperature: " + snow5.temperature);
        System.out.println("Season: " + snow5.season);
        System.out.println("Thickness: " + snow5.thickness);
        System.out.println("Is Frozen: " + snow5.isFrozen);
    }
}