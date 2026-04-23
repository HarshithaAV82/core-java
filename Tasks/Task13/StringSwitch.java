class StringSwitch{

    public static void main(String[] args) {
        String weather = "Rainy";
        planActivity(weather);
    }

    static void planActivity(String weather) {
        switch(weather) {
            case "Sunny":
                System.out.println("Go for a picnic");
                break;
            case "Rainy":
                System.out.println("Stay indoors and read a book");
                break;
            case "Cloudy":
                System.out.println("Take a walk in the park");
                break;
            case "Windy":
                System.out.println("Fly a kite");
                break;
            case "Snowy":
                System.out.println("Build a snowman");
                break;
            default:
                System.out.println("Weather unknown, plan accordingly");
                break; 
        }
    }
}
