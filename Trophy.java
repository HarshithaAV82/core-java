class Trophy{

    String trophyName;
    String eventName;
    String winnerName;
    String category;
    String material;
    String color;
    String shape;
    String sponsor;
    String country;
    String engravingText;
    double height;
    double weight;
    double price;
    double baseWidth;
    int year;
    int rank;
    int quantity;
    boolean isGoldPlated;
    boolean isCustomMade;
    boolean hasCertificate;

    Trophy(String trophyName, String eventName, String winnerName, String category,
           String material, String color, String shape, String sponsor,
           String country, String engravingText,
           double height, double weight, double price, double baseWidth,
           int year, int rank, int quantity,
           boolean isGoldPlated, boolean isCustomMade, boolean hasCertificate) {

        this.trophyName = trophyName;
        this.eventName = eventName;
        this.winnerName = winnerName;
        this.category = category;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.sponsor = sponsor;
        this.country = country;
        this.engravingText = engravingText;
        this.height = height;
        this.weight = weight;
        this.price = price;
        this.baseWidth = baseWidth;
        this.year = year;
        this.rank = rank;
        this.quantity = quantity;
        this.isGoldPlated = isGoldPlated;
        this.isCustomMade = isCustomMade;
        this.hasCertificate = hasCertificate;
    }

    void displayDetails(){  
        System.out.println("Trophy Name: " + trophyName);
        System.out.println("Event Name: " + eventName);
        System.out.println("Winner Name: " + winnerName);
        System.out.println("Category: " + category);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Country: " + country);
        System.out.println("Engraving Text: " + engravingText);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Base Width: " + baseWidth);
        System.out.println("Year: " + year);
        System.out.println("Rank: " + rank);
        System.out.println("Quantity: " + quantity);
        System.out.println("Gold Plated: " + isGoldPlated);
        System.out.println("Custom Made: " + isCustomMade);
        System.out.println("Has Certificate: " + hasCertificate);

      
    }
}