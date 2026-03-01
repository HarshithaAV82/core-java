class Toxic{

    String chemicalName;
    String commonName;
    String type;
    String source;
    String color;
    String smell;
    String state;
    String exposureMethod;
    String antidote;
    String safetyLevel;
    double toxicityLevel;
    double lethalDose;
    double boilingPoint;
    double meltingPoint;
    int hazardRating;
    int discoveryYear;
    int shelfLifeDays;
    boolean flammable;
    boolean radioactive;
    boolean corrosive;

    
    Toxic(String chemicalName, String commonName, String type, String source,
          String color, String smell, String state, String exposureMethod,
          String antidote, String safetyLevel,
          double toxicityLevel, double lethalDose,
          double boilingPoint, double meltingPoint,
          int hazardRating, int discoveryYear, int shelfLifeDays,
          boolean flammable, boolean radioactive, boolean corrosive) {

        this.chemicalName = chemicalName;
        this.commonName = commonName;
        this.type = type;
        this.source = source;
        this.color = color;
        this.smell = smell;
        this.state = state;
        this.exposureMethod = exposureMethod;
        this.antidote = antidote;
        this.safetyLevel = safetyLevel;
        this.toxicityLevel = toxicityLevel;
        this.lethalDose = lethalDose;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.hazardRating = hazardRating;
        this.discoveryYear = discoveryYear;
        this.shelfLifeDays = shelfLifeDays;
        this.flammable = flammable;
        this.radioactive = radioactive;
        this.corrosive = corrosive;
    }

    void show() {
        System.out.println("Chemical Name: " + chemicalName);
        System.out.println("Common Name: " + commonName);
        System.out.println("Type: " + type);
        System.out.println("Source: " + source);
        System.out.println("Color: " + color);
        System.out.println("Smell: " + smell);
        System.out.println("State: " + state);
        System.out.println("Exposure Method: " + exposureMethod);
        System.out.println("Antidote: " + antidote);
        System.out.println("Safety Level: " + safetyLevel);
        System.out.println("Toxicity Level: " + toxicityLevel);
        System.out.println("Lethal Dose: " + lethalDose);
        System.out.println("Boiling Point: " + boilingPoint);
        System.out.println("Melting Point: " + meltingPoint);
        System.out.println("Hazard Rating: " + hazardRating);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Shelf Life Days: " + shelfLifeDays);
        System.out.println("Flammable: " + flammable);
        System.out.println("Radioactive: " + radioactive);
        System.out.println("Corrosive: " + corrosive);
    }
}