class RainRunner{

    public static void main(String[] args) {

        Rain rain = new Rain("Monsoon", 75.5, "June", 3.5, true);
        System.out.println("Type: " + rain.type);
        System.out.println("Intensity: " + rain.intensity);
        System.out.println("Season: " + rain.season);
        System.out.println("Duration: " + rain.duration);
        System.out.println("Is Heavy: " + rain.isHeavy);

        Rain rain1 = new Rain("Drizzle");
        System.out.println("Type: " + rain1.type);

        Rain rain2 = new Rain(50.0, "July");
        System.out.println("Intensity: " + rain2.intensity);
        System.out.println("Season: " + rain2.season);

        Rain rain3 = new Rain(2.5, false);
        System.out.println("Duration: " + rain3.duration);
        System.out.println("Is Heavy: " + rain3.isHeavy);

        Rain rain4 = new Rain("Winter", 4.0, true);
        System.out.println("Season: " + rain4.season);
        System.out.println("Duration: " + rain4.duration);
        System.out.println("Is Heavy: " + rain4.isHeavy);

        Rain rain5 = new Rain();
        System.out.println("Type: " + rain5.type);
        System.out.println("Intensity: " + rain5.intensity);
        System.out.println("Season: " + rain5.season);
        System.out.println("Duration: " + rain5.duration);
        System.out.println("Is Heavy: " + rain5.isHeavy);
    }
}