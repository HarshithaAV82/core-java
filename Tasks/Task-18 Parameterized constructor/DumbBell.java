class DumbBell{

    String brand;
    String type;
    String material;
    String color;
    String shape;
    String gripType;
    String coating;
    String usage;
    String countryOfOrigin;
    String modelNumber;
    double weight;
    double price;
    double length;
    double handleDiameter;
    int quantityAvailable;
    int warrantyYears;
    int rating;
    boolean adjustable;
    boolean rubberCoated;
    boolean antiSlip;

    DumbBell(String brand, String type, String material, String color,
             String shape, String gripType, String coating, String usage,
             String countryOfOrigin, String modelNumber,
             double weight, double price, double length, double handleDiameter,
             int quantityAvailable, int warrantyYears, int rating,
             boolean adjustable, boolean rubberCoated, boolean antiSlip) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.gripType = gripType;
        this.coating = coating;
        this.usage = usage;
        this.countryOfOrigin = countryOfOrigin;
        this.modelNumber = modelNumber;
        this.weight = weight;
        this.price = price;
        this.length = length;
        this.handleDiameter = handleDiameter;
        this.quantityAvailable = quantityAvailable;
        this.warrantyYears = warrantyYears;
        this.rating = rating;
        this.adjustable = adjustable;
        this.rubberCoated = rubberCoated;
        this.antiSlip = antiSlip;
    }

    void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Coating: " + coating);
        System.out.println("Usage: " + usage);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Handle Diameter: " + handleDiameter);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Rating: " + rating);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Rubber Coated: " + rubberCoated);
        System.out.println("Anti Slip: " + antiSlip);

       
    }
}